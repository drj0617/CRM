<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Frameset//EN" "http://www.w3c.org/TR/1999/REC-html401-19991224/frameset.dtd">
<HTML xmlns="http://www.w3.org/1999/xhtml">
<HEAD>
<META http-equiv=Content-Type content="text/html; charset=utf-8">
<STYLE type=text/css>
BODY {
	FONT-SIZE: 12px;
	COLOR: #ffffff;
	FONT-FAMILY: 宋体
}

TD {
	FONT-SIZE: 12px;
	COLOR: #ffffff;
	FONT-FAMILY: 宋体
}
</STYLE>

<META content="MSHTML 6.00.6000.16809" name=GENERATOR>
</HEAD>
<BODY>
	<FORM id=form1 name=form1 method=post
		action="${pageContext.request.contextPath }/UserAction_login">
			<!-- onsubmit="javascript:return WebForm_OnSubmit();" -->

		<DIV id=UpdatePanel1>
			<DIV id=div1
				style="LEFT: 0px; POSITION: absolute; TOP: 0px; BACKGROUND-COLOR: #0066ff"></DIV>
			<DIV id=div2
				style="LEFT: 0px; POSITION: absolute; TOP: 0px; BACKGROUND-COLOR: #0066ff"></DIV>


			<DIV>&nbsp;&nbsp;</DIV>
			<DIV>
				<TABLE cellSpacing=0 cellPadding=0 width=900 align=center border=0>
					<TBODY>
						<TR>
							<TD style="HEIGHT: 105px"><IMG src="images/login_1.gif"
								border=0></TD>
						</TR>
						<TR>
							<TD background=images/login_2.jpg height=300>
								<TABLE height=300 cellPadding=0 width=900 border=0>
									<TBODY>
										<TR>
											<TD colSpan=2 height=35></TD>
										</TR>
										<TR>
											<TD width=360></TD>
											<TD>
												<TABLE cellSpacing=0 cellPadding=2 border=0>
													<TBODY>
														<TR>
															<TD style="HEIGHT: 28px" width=80>登 录 名：</TD>
															<TD style="HEIGHT: 28px" width=150><INPUT id="user_code"
																style="WIDTH: 130px" name="user_code" value="${param.user_code }"></TD>
															<TD style="HEIGHT: 28px" width=370><SPAN
																id=RequiredFieldValidator3
																style="FONT-WEIGHT: bold; VISIBILITY: hidden; COLOR: white">请输入登录名</SPAN></TD>
														</TR>
														<TR>
															<TD style="HEIGHT: 28px">登录密码：</TD>
															<TD style="HEIGHT: 28px"><INPUT id="user_password"
																style="WIDTH: 130px" type=password name="user_password"></TD>
															<TD style="HEIGHT: 28px"><SPAN
																id=RequiredFieldValidator4
																style="FONT-WEIGHT: bold; VISIBILITY: hidden; COLOR: white">请输入密码</SPAN></TD>
														</TR>
<!-- 														<TR> -->
<!-- 															<TD style="HEIGHT: 28px">验证码：</TD> -->
<!-- 															<TD style="HEIGHT: 28px"><INPUT id=txtcode -->
<!-- 																style="WIDTH: 130px" name=""></TD> -->
<!-- 															<TD style="HEIGHT: 28px">&nbsp;</TD> -->
<!-- 														</TR> -->
														<TR>
															<TD style="HEIGHT: 18px" colspan="2" align="center">
																<!-- value 中是OGNL表达式
																			property标签 value属性在root栈顶
																 -->
																<s:property value="exception.message"/>
															</TD>
															<TD style="HEIGHT: 18px"></TD>
<!-- 															<TD style="HEIGHT: 18px"></TD> -->
														</TR>
														<TR>
															<TD></TD>
															<TD><INPUT id=btn
																style="BORDER-TOP-WIDTH: 0px; BORDER-LEFT-WIDTH: 0px; BORDER-BOTTOM-WIDTH: 0px; BORDER-RIGHT-WIDTH: 0px"
																onclick='javascript:WebForm_DoPostBackWithOptions(new WebForm_PostBackOptions("btn", "", true, "", "", false, false))'
																type=image src="images/login_button.gif" name=btn>
															</TD>
														</TR>
													</TBODY>
												</TABLE>
											</TD>
										</TR>
									</TBODY>
								</TABLE>
							</TD>
						</TR>
						<TR>
							<TD><IMG src="images/login_3.jpg" border=0></TD>
						</TR>
					</TBODY>
				</TABLE>
			</DIV>
		</DIV>


	</FORM>
</BODY>
</HTML>
