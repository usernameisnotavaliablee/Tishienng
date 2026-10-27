# TSN APP 逆向分析报告

## 基本信息
- 包名: com.bxkj.student
- 公司: 博星科技 (boxkj.com / tsnkj.com)
- 类型: 校园体育运动教学 APP
- 加固: 360加固 (libjiagu.so / libjiagu_a64.so)
- classes.dex: 仅4个壳类，真正的代码被加密

## 源码路径（从SO调试信息还原）
原始JNI项目: C:/Android/Code/dependencies/TsnJNISecret/app/src/main/jni/
- src/AESUtils.cpp - AES加解密
- src/Base64Utils.cpp - Base64编解码
- src/Sign.cpp - 签名生成
- src/ClientEncrypt.cpp - 客户端加密逻辑

## 服务器地址
- API主站: https://a.tsnkj.com/
- Web站点: https://h.tsnkj.com/
- 管理后台: https://m.boxkj.com/
- 蒲公英更新: https://www.pgyer.com/apiv2/app/check
- 运动圈H5: http://circle.h5.tsnkj.com/

## JNI Native函数
aes_encrypt/aes_decrypt, rsa_encrypt/rsa_decrypt, aesRsaEncrypt/aesRsaDecrypt,
encryptAppId, encryptAppSecret, auth, native_auth_5dm, native_auth_1ahs,
native_auth_652ahs, auth_sjk, encodeToString, getSignatureByte, oldSign,
urlEncode, urlDecode, buildKeyValue, generateAuthInfo, hashByteArray4HASH

## RSA公钥 (2048bit)
MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAgzQ7BYqBZ5LTjoOb9aHO8fI0hbww9YRW2lnqIdDyIjBwmhthTR+EmiKNm4yFKg6Vz2GW5ix3IdUQdaAq3ZZ7se/dCOTpu3dk15ZgkO6ZImUE7gqzSXXJ0NaACudk4yJwk3Q69kB4m3xIKxiOlG2HtbEed01LrUmLag9VOP96BuSao2sP4Als5hA/8C6KqdihTOcZF1RT+lqrT3Qvja7q+qI5QZw9d7NrFFycQs8jk8O49f9mkvLZRZCCWEbwzuCPTlMy/ZNAsMeU/gNSRKUnquOiPboc2KUhsvY4cK0GeuS9vuIrMGE01L/BCc+rUrautq3n3WiIVJwnwWiJtgk33QIDAQAB

## 关键常量名
AUTH_KEY, BJYDDXSJXY_NFC_KEY, QR_CODE_KEY, SIGNATRUE_QZONE, WJXY_NFC_KEY

## API端点（41个，带签名Key）
### 认证
- auth/oauth/token
- auth/token/logout

### 用户/学校
- upms/basUser/getLoginUserInfo
- upms/basUser/getLoginUserInfoThird
- upms/basUser/isDefalutPass
- upms/sysSchool/getAppid
- upms/sysSchool/getAppSocketServer
- upms/sysSchool/getSchoolDetail
- upms/app/listMenu
- upms/app/getH5Url
- upms/app/getWeather
- upms/app/saveWeather

### 人脸/运动
- upms/basUserImage/addUserFace
- exercise/exerciseRunningFace/2a36d143/face
- exercise/exerciseRunningFace/faceVer

### 运动记录
- exercise/exerciseRecord/2a36d143/addExerciseRecord
- exercise/exerciseRecord/2a36d143/listExerciseRecord
- exercise/exerciseRecord/2a36d143/getExerciseRecord
- exercise/exerciseRecord/checkExerciseRecord
- exercise/exerciseRecord/statisticsExerciseRecord
- exercise/exerciseRecord/sumExerciseRecord

### 运动设置
- exercise/exerciseSetting/2a36d143/getSetting
- exercise/exerciseSetting/2a36d143/getExerciseStartTime
- exercise/exerciseSetting/checkTimeOut
- exercise/exerciseSetting/getExerciseQuestion
- exercise/exerciseSetting/sendFace2DeviceResult
- exercise/exerciseExplanation/getExerciseExplanationV2

### 反馈
- exercise/exerciseFeedback/addExerciseFeedback
- exercise/exerciseFeedback/getFeedbackBalance

### 消息
- upms/messageArticle/listByType
- upms/messageArticleClickRecord/appClickArticle
- upms/messageNotice/getLatestUnreadNotice
- upms/messageNotice/getMessageNoticeVoById

### 其他
- app/stuGymClockRecord/addStuGymClockRecord

## 技术栈
- 加密: OpenSSL 1.1.1w
- JSON: nlohmann/json v3.11.3
- 编译: NDK 21.1 + clang 9.0.8 (OLLVM混淆)
- 其他SO: 高德地图、百度人脸、EasyAR、IJKPlayer、PaddlePaddle、SQLCipher
