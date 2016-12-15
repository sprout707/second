/**
 *  비밀번호 찾기
 *  ** 해당 스크립트보다 제이쿼리와 부트스트랩을 먼저 링크해야
 *     정상 작동합니다.
 */

$(function()
	{
		//1단계 모달창 열기
		$("#modal_open").click(function()
		{
			$("#modal_first").modal();
			$("#emailWarn").text("");
			$("#email").val("");
		});
		
		
		//1단계 '다음'버튼 클릭 시 로직
		$("#first").click(function()
		{
			//1. 이메일 유효성 검사
			var email=$("#email").val();
			var regex=/^([\w-]+(?:\.[\w-]+)*)@((?:[\w-]+\.)*\w[\w-]{0,66})\.([a-z]{2,6}(?:\.[a-z]{2})?)$/;
			
			  //1-1. 이메일 입력값 체크 1: 입력했는지 확인
			if(email=="" || email==null)
			{
				$("#emailWarn").text("이메일을 입력하세요");
				$("#email").focus();
				return;
			}
			  //1-2. 이메일 입력값 체크 2: 이메일 유형인지 확인
			if(regex.test(email) == false)
			{
				$("#emailWarn").text("test@localhost.com 과 같은 형태의 이메일 주소를 입력하세요");
				$("#email").focus();
				return;
			}
			
			
			//2. 이메일 확인 동작 페이지로 값을 넘겨줌
			$.post('/localhost/user/userpwfirst', {email: email})
    		.done(function(data)
    			{
    				if(data==null || data=='')
					{
    					$("#emailWarn").text("서버가 불안정합니다. 잠시후 다시 시도해 주세요 ㅠ^ㅠ");
    					$("#email").focus();
    					return;
					}

					dataJson=JSON.parse(data);
					var result=dataJson.result;
					code=dataJson.code;
			
					if(result==false)
					{
						$("#emailWarn").text(email+"이라는 계정은 없습니다! 새로 가입하거나 다른 이메일을 입력하세요!");
						$("#email").focus();
						return;
					}
			
					if(result==true)
					{
						$("#modal_first").modal('hide');
						$("#modal_second").modal(); //2단계 모달창을 열어준다.
						return;
					}
    			})
    		.fail(function() 
    			{
    				$("#emailWarn").text("서버가 불안정합니다. 잠시후 다시 시도해 주세요 ㅠ^ㅠ");
					$("#email").focus();
					return;
    			});
			
		});
		
		//2단계 모달창 입력 후 버튼 클릭 이벤트
		$("#second").click(function()
		{
			var inputCode=$("#code").val();
			
			if(inputCode!=code)
			{
				$("#codeWarn").text("잘못 입력하셨습니다!");
				$("#code").focus();
				return;
			}
			
			$.post('/localhost/user/userpwlast', {email: $("#email").val()})
    		.done(function(data)
    			{
					$("#third_result").text(data);
					$("#modal_second").modal('hide');
					$("#modal_third").modal();
    			})
    		.fail(function() 
    			{
    				$("#codeWarn").text("서버가 불안정합니다. 잠시후 다시 시도해 주세요 ㅠ^ㅠ");
					return;
    			});
			
			
			
			
		});
		
		
		//1단계 모달창 열릴 때 로직
		$("#modal_first").on('shown.bs.modal', function()
		{
			$("#emailWarn").text("");
			$("#email").focus();
		});
		
		//2단계 모달창 열릴 때 로직
		$("#modal_second").on('shown.bs.modal', function()
		{
			$("#codeWarn").text("");
			$("#code").focus();
		});
		
		
		//1단계 모달창 파괴 시 이벤트
		$("#modal_first").on('hidden.bs.modal', function()
		{
			$("#emailWarn").text("");
		});
		
		//2단계 모달창 파괴 시 이벤트
		$("#modal_second").on('hidden.bs.modal', function()
		{
			$("#code").val("");
			$("#codeWarn").text("");
		});
		
		//3단계 모달창 파괴 시 이벤트
		$("#modal_third").on('hidden.bs.modal', function()
		{
			$("#email").val("");
			$("#third_result").text("");
		});
		
	});
	
	