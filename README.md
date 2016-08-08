这个案例项目是我用Retrofit + RxJava + MVP完成的

具体实现如下：

一、Retrofit：
1、对于统一请求参数的封装(封装到请求头中)

2、实体类解析（a.实体基类）

3、网络请求管理类：

二、RxJava
1、对于返回值的统一处理 (a.处理完成后的回调接口;b.进行统一处理)

三、MVP：
1、BasePresent:model和view交互的桥梁

四、简单登录页面demo：
1、LoginContract便于管理model，view，present的接口

2、LoginActivity：将网络请求需要的数据传给present，将present返回的数据做页面显示处理

3、LoginModel：数据请求的操作：

4、LoginPresent：
# rrmvp
# rrmvp
