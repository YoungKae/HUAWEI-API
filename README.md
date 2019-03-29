# 华为API管理系统

## Api注解

 1.@Api

@Api注解放在类上面，说明该类的作用这里的value是没用的，tags表示该controller的介绍。

2. @ApiOperation
效果：
@ApiOperation注解用于放在方法上面，说明方法的作用。其中value是该类的简短的叙述，notes一般是该方法的详细描述。

3. @ApiImplicitParam 与 @ApiImplicitParams
效果：略
@ApiImplicitParam注解用于表明前端传入的name参数的名字，required是否为必需项，以及dataType参数类型，以及paramType传递方式（query表示使用url问号的方式传参，这种比较常用，如果使用formData的方式进行传参，那么paramType的值为 form）. 当有多个参数时，需要用@ApiImplicitParams将@ApiImplicitParam包起来

paramType：参数放在哪个地方
      header–>请求参数的获取：@RequestHeader
      query–>请求参数的获取：@RequestParam
      path（用于restful接口）–>请求参数的获取：@PathVariable
      body（不常用）
      form（不常用）
name：参数名
dataType：参数类型
required：参数是否必须传
value：参数的意思
defaultValue：参数的默认值@ApiImplicitParams({
        @ApiImplicitParam(name = "id", value = "唯一id", required = true, dataType = "Long", paramType = "path"),
})

4. @ApiResponses
用于表示一组响应
5. @ApiResponse
用在@ApiResponses中，一般用于表达一个错误的响应信息
code：数字，例如400
message：信息，例如”请求参数没填好”
response：抛出异常的类@ApiResponses(value = {  
          @ApiResponse(code = 400, message = "No Name Provided")  
  })
6. @ApiModel
Swagger-core builds the model definitions based on the references to them throughout the API introspection. 
The @ApiModel allows you to manipulate the meta data of a model from a simple description or name change to a definition of polymorphism.
描述一个Model的信息（这种一般用在post创建的时候，使用@RequestBody这样的场景，请求参数无法使用@ApiImplicitParam注解进行描述的时候）
@ApiModel(value = "用户实体类")
7. @ApiModelProperty
描述一个model的属性
@ApiModelProperty(value = "登录用户")
@ApiIgnore //使用这个注解忽略这个接口

## swagger
