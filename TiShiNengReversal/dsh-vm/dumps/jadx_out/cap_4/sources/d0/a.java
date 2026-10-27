package d0;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public interface a {
    public static final java.lang.String a = null;

    static {
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r0 = r0.getServerUrl()
            d0.a.a = r0
            return
    }

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/appStuForLeaveApply/findStuLeaveCurriculumApplyByUserId")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> A(@retrofit2.http.Field("stuTeacherCurriculumId") java.lang.String r1);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/stuTermScore/listcallStu")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> A0(@retrofit2.http.Field("id") java.lang.String r1);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/fieldPlan/getRecordCount")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> A1(@retrofit2.http.Field("userId") java.lang.String r1, @retrofit2.http.Field("appointType") int r2, @retrofit2.http.Field("date") java.lang.String r3);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/appMeaPerformanceFeedback/applyMeaPerformanceFeedback")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> B(@retrofit2.http.Field("userId") java.lang.String r1, @retrofit2.http.Field("meaScoreId") java.lang.String r2, @retrofit2.http.Field("examId") java.lang.String r3, @retrofit2.http.Field("rawScores") java.lang.String r4, @retrofit2.http.Field("complaintResults") java.lang.String r5, @retrofit2.http.Field("userPhone") java.lang.String r6, @retrofit2.http.Field("applyReason") java.lang.String r7);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/appMeaPerformanceFeedback/getMeaPerformanceFeedbackDetail")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> B0(@retrofit2.http.Field("id") java.lang.String r1);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/scheduleExamStu/toadd")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> B1(@retrofit2.http.Field("stuId") java.lang.String r1, @retrofit2.http.Field("id") java.lang.String r2);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/scheduleExamStu/scheduleExamStuCancel")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> C(@retrofit2.http.Field("id") java.lang.String r1);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/appStuForLeaveApply/findStuLeaveCurriculumApplyById")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> C0(@retrofit2.http.Field("id") java.lang.String r1);

    @retrofit2.http.GET("app/appStuMeaSchedule/getStuMeaInfo")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> C1();

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/stuTermScore/isLookScoreFX")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> D(@retrofit2.http.Field("stuTermScoreid") java.lang.String r1);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/appStuMeaSchedule/applyMonitor")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> D0(@retrofit2.http.Field("userId") java.lang.String r1);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/stuTeacherCurriculum/bluetoothDian")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> D1(@retrofit2.http.Field("teachingClockingin") java.lang.String r1, @retrofit2.http.Field("stuTeacherCurriculum") java.lang.String r2, @retrofit2.http.Field("weekNum") java.lang.String r3, @retrofit2.http.Field("baddress") java.lang.String r4, @retrofit2.http.Field("schoolId") java.lang.String r5);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/chooseCurriculum/chooseTeachingCurriculum")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> E(@retrofit2.http.Field("userId") java.lang.String r1);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/stuPunchRecord/findPagerOk")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> E0(@retrofit2.http.Field("userNum") java.lang.String r1, @retrofit2.http.Field("sysTermId") java.lang.String r2, @retrofit2.http.Field("pageIndex") int r3, @retrofit2.http.Field("pageSize") int r4);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/appStuMeaSchedule/getStuCanInputExams")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> E1(@retrofit2.http.Field("userId") java.lang.String r1);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/onlineExam/explainList")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> F(@retrofit2.http.Field("stuId") java.lang.String r1, @retrofit2.http.Field("onlineType") int r2);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/face/checkUserByFace")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> F0(@retrofit2.http.Field("base64Images") java.lang.String r1, @retrofit2.http.Field("userNum") java.lang.String r2);

    @retrofit2.http.POST("app/runingFace/registerFaceApi")
    @retrofit2.http.Multipart
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> F1(@retrofit2.http.Part okhttp3.MultipartBody.Part r1, @retrofit2.http.Part okhttp3.MultipartBody.Part r2);

    @retrofit2.http.POST("punch/findAllTermList")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> G();

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/bindUserPhoneByUserId")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> G0(@retrofit2.http.Field("userId") java.lang.String r1, @retrofit2.http.Field("phone") java.lang.String r2);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/actOrder/getCurriculum")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> G1(@retrofit2.http.Field("uid") java.lang.String r1, @retrofit2.http.Field("id") java.lang.String r2);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/onlineExam/loadExamExplain")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> H(@retrofit2.http.Field("onlineType") int r1);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/appMeaPerformanceFeedback/getMeaPerformanceFeedbackList")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> H0(@retrofit2.http.Field("userId") java.lang.String r1, @retrofit2.http.Field("meaScoreId") java.lang.String r2);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/competeSign/getAppCompetitionList")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> H1(@retrofit2.http.Field("pageSize") int r1, @retrofit2.http.Field("pageIndex") int r2);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/onlineExam/stuExamOnlineList")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> I(@retrofit2.http.Field("userId") java.lang.String r1, @retrofit2.http.Field("onlineType") int r2);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/appStuMeaSchedule/list")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> I0(@retrofit2.http.Field("userId") java.lang.String r1, @retrofit2.http.Field("type") java.lang.String r2, @retrofit2.http.Field("pageIndex") int r3, @retrofit2.http.Field("pageSize") int r4);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/dlbindThirdInfo")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> I1(@retrofit2.http.Field("userNum") java.lang.String r1, @retrofit2.http.Field("name") java.lang.String r2, @retrofit2.http.Field("type") java.lang.String r3, @retrofit2.http.Field("id") java.lang.String r4, @retrofit2.http.Field("nickName") java.lang.String r5, @retrofit2.http.Field("img") java.lang.String r6);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/chooseCurriculum/showTeaSysUser")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> J(@retrofit2.http.Field("teacherId") java.lang.String r1);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("punch/loadQualifiedPunchRecordWeekData")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> J0(@retrofit2.http.Field("userId") java.lang.String r1, @retrofit2.http.Field("termId") java.lang.String r2);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/appMeaNonStuApply/getMeaNonStuApplyRecords")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> K(@retrofit2.http.Field("userId") java.lang.String r1);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/measure/countStuMeaScore")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> K0(@retrofit2.http.Field("sex") java.lang.String r1, @retrofit2.http.Field("grade") java.lang.String r2, @retrofit2.http.Field("height") java.lang.String r3, @retrofit2.http.Field("weight") java.lang.String r4, @retrofit2.http.Field("vitalCapacity") java.lang.String r5, @retrofit2.http.Field("standingLongJump") java.lang.String r6, @retrofit2.http.Field("sittingBodyFlexion") java.lang.String r7, @retrofit2.http.Field("meters50") java.lang.String r8, @retrofit2.http.Field("meters") java.lang.String r9, @retrofit2.http.Field("pullOrSit") java.lang.String r10);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/ispwdmod")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> L(@retrofit2.http.Field("userNum") java.lang.String r1);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/actOrder/update")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> L0(@retrofit2.http.Field("uid") java.lang.String r1, @retrofit2.http.Field("id") java.lang.String r2, @retrofit2.http.Field("curriculum") java.lang.String r3);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/stuTermScore/uidSelect")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> M(@retrofit2.http.Field("uid") java.lang.String r1, @retrofit2.http.Field("pageIndex") int r2, @retrofit2.http.Field("pageSize") int r3);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/appStuMeaSchedule/cancelMeaRecordCtl")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> M0(@retrofit2.http.Field("id") java.lang.String r1, @retrofit2.http.Field("userId") java.lang.String r2);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/evaluate/saveAssessPaper")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> N(@retrofit2.http.Field("stuTeacherCurriculumId") java.lang.String r1, @retrofit2.http.Field("stuId") java.lang.String r2, @retrofit2.http.Field("data") java.lang.String r3);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/evaluate/stuHasEvaluatedSuccess")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> N0(@retrofit2.http.Field("stuTeacherCurriculumId") java.lang.String r1, @retrofit2.http.Field("stuId") java.lang.String r2, @retrofit2.http.Field("onlineType") int r3);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/appstu/uploadGatherPhotoBase64")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> O(@retrofit2.http.Field("userId") java.lang.String r1, @retrofit2.http.Field("base64") java.lang.String r2);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/appStuMeaSchedule/list")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> O0(@retrofit2.http.Field("userId") java.lang.String r1, @retrofit2.http.Field("type") java.lang.String r2, @retrofit2.http.Field("pageIndex") int r3, @retrofit2.http.Field("pageSize") int r4);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/measure/getStuScoreDetail")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> P(@retrofit2.http.Field("meaScoreId") java.lang.String r1);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/competeSign/cancelSignUpItem")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> P0(@retrofit2.http.Field("itemId") java.lang.String r1, @retrofit2.http.Field("userId") java.lang.String r2);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/teacherCurriculum/chooseTeachingCurriculum")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> Q(@retrofit2.http.Field("stuid") java.lang.String r1, @retrofit2.http.Field("parameter") java.lang.Integer r2);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/scheduleExam/stuScheduleExamList")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> Q0(@retrofit2.http.Field("stuid") java.lang.String r1);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/getSysUserByThirdId")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> R(@retrofit2.http.Field("type") java.lang.String r1, @retrofit2.http.Field("thirdId") java.lang.String r2);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/evaluate/checkUserAssessTime")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> R0(@retrofit2.http.Field("userId") java.lang.String r1);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/appsyshelp/appsyshelplist")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> S(@retrofit2.http.Field("helpType") int r1, @retrofit2.http.Field("pageIndex") int r2, @retrofit2.http.Field("pageSize") int r3);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/callStuIdentify/userAddCallStuIdentify")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> S0(@retrofit2.http.Field("uid") java.lang.String r1);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/appMeaNonStuApply/applyMeaNonStuApply")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> T(@retrofit2.http.Field("userId") java.lang.String r1, @retrofit2.http.Field("address") java.lang.String r2, @retrofit2.http.Field("applyMemo") java.lang.String r3, @retrofit2.http.Field("fileNames") java.lang.String r4, @retrofit2.http.Field("imgs") java.lang.String r5, @retrofit2.http.Field("meaStatusId") java.lang.String r6, @retrofit2.http.Field("yearId") java.lang.String r7);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/getUserInfoByTel")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> T0(@retrofit2.http.Field("phone") java.lang.String r1);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/appstu/checkInfo2RestPwd")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> U(@retrofit2.http.Field("uname") java.lang.String r1, @retrofit2.http.Field("cardId") java.lang.String r2, @retrofit2.http.Field("cnames") java.lang.String r3);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/chooseCurriculum/showTime")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> U0(@retrofit2.http.Field("userId") java.lang.String r1, @retrofit2.http.Field("teachingId") java.lang.String r2);

    @retrofit2.http.POST("app/scheduleExamStu/getScheduleExamExplain")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> V();

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/modPasswd")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> V0(@retrofit2.http.Field("userId") java.lang.String r1, @retrofit2.http.Field("originalpwd") java.lang.String r2, @retrofit2.http.Field("newpwd") java.lang.String r3);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/stuTermPunchRecord/findList")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> W(@retrofit2.http.Field("userId") java.lang.String r1);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/scheduleExamStu/scheduleExamStuCtlStulist")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> W0(@retrofit2.http.Field("uid") java.lang.String r1);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/teaMeaSchedule/addScore")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> X(@retrofit2.http.Field("userId") java.lang.String r1, @retrofit2.http.Field("userNum") java.lang.String r2, @retrofit2.http.Field("examId") java.lang.String r3, @retrofit2.http.Field("variable") java.lang.String r4);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/evaluate/loadAssessData")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> X0(@retrofit2.http.Field("stuId") java.lang.String r1);

    @retrofit2.http.POST("app/onlineExam/explainTeacherCurriculumList")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> Y();

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/measure/appTiceRank")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> Y0(@retrofit2.http.Field("type") int r1, @retrofit2.http.Field("userId") java.lang.String r2);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/appnotice/noReadNotice")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> Z(@retrofit2.http.Field("userId") java.lang.String r1, @retrofit2.http.Field("identity") java.lang.String r2);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/evaluate/stuAssessTeaList")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> Z0(@retrofit2.http.Field("userId") java.lang.String r1);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/fieldPlan/fieldPlanAppointedList")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> a(@retrofit2.http.Field("userId") java.lang.String r1, @retrofit2.http.Field("type") int r2, @retrofit2.http.Field("pageIndex") int r3, @retrofit2.http.Field("pageSize") int r4);

    @retrofit2.http.GET("app/config/getCustomerServiceConfig")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> a0();

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/relieveBindThirdInfo")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> a1(@retrofit2.http.Field("type") java.lang.String r1, @retrofit2.http.Field("userId") java.lang.String r2);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/appCompetition/getAppCompeteItems")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> b(@retrofit2.http.Field("competitionId") java.lang.String r1, @retrofit2.http.Field("userId") java.lang.String r2);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/evaluate/checkUserAssessTime1")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> b0(@retrofit2.http.Field("userId") java.lang.String r1, @retrofit2.http.Field("stuTeacherCurriculumId") java.lang.String r2);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/appStuMeaSchedule/doadd")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> b1(@retrofit2.http.Field("id") java.lang.String r1, @retrofit2.http.Field("userId") java.lang.String r2);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/fieldPlan/stuAppointField")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> c(@retrofit2.http.Field("userId") java.lang.String r1, @retrofit2.http.Field("fieldPlanDateId") java.lang.String r2, @retrofit2.http.Field("detailId") java.lang.String r3, @retrofit2.http.Field("status") java.lang.String r4);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/learnWork/getLearnWorkdetail")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> c0(@retrofit2.http.Field("learnWorkId") java.lang.String r1);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/config/getUploadMethod")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> c1(@retrofit2.http.Field("method") java.lang.String r1);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/appCompetition/competeUserSignUp")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> d(@retrofit2.http.Field("itemId") java.lang.String r1, @retrofit2.http.Field("userId") java.lang.String r2);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/actOrder/doList")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> d0(@retrofit2.http.Field("uid") java.lang.String r1, @retrofit2.http.Field("pageIndex") int r2, @retrofit2.http.Field("pageSize") int r3);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/onlineExam/isCourseSelection")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> d1(@retrofit2.http.Field("stuTeacherCurriculumId") java.lang.String r1, @retrofit2.http.Field("onlineType") int r2);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/appCompetition/getAppCompetitionDetail")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> e(@retrofit2.http.Field("competitionId") java.lang.String r1);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/onlineExam/deleteStuPaper")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> e0(@retrofit2.http.Field("stuId") java.lang.String r1, @retrofit2.http.Field("identify") java.lang.String r2);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/appstu/userCheckUserNum")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> e1(@retrofit2.http.Field("userNum") java.lang.String r1, @retrofit2.http.Field("userName") java.lang.String r2, @retrofit2.http.Field("userPhone") java.lang.String r3);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/appCompetition/cancelSignUpItem")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> f(@retrofit2.http.Field("itemId") java.lang.String r1, @retrofit2.http.Field("userId") java.lang.String r2);

    @retrofit2.http.POST("app/onlineExam/loadExamContentDataYD")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> f0();

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/updateStudentInfo")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> f1(@retrofit2.http.Field("userId") java.lang.String r1, @retrofit2.http.Field("email") java.lang.String r2, @retrofit2.http.Field("nationId") java.lang.Object r3, @retrofit2.http.Field("sourceId") java.lang.Object r4, @retrofit2.http.Field("address") java.lang.String r5, @retrofit2.http.Field("identityCard") java.lang.String r6, @retrofit2.http.Field("suspId") java.lang.String r7, @retrofit2.http.Field("sysStuDetailId") java.lang.String r8);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/appCompetition/getAppCompetitionList")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> g(@retrofit2.http.Field("competitionId") java.lang.String r1, @retrofit2.http.Field("pageIndex") int r2, @retrofit2.http.Field("pageSize") int r3);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/field/getChilFieldByPid")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> g0(@retrofit2.http.Field("id") java.lang.String r1);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/bindThirdInfo")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> g1(@retrofit2.http.Field("userId") java.lang.String r1, @retrofit2.http.Field("type") java.lang.String r2, @retrofit2.http.Field("id") java.lang.String r3, @retrofit2.http.Field("nickName") java.lang.String r4, @retrofit2.http.Field("img") java.lang.String r5);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/appCompetition/getMyAppCompeteItems")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> h(@retrofit2.http.Field("competitionId") java.lang.String r1, @retrofit2.http.Field("userId") java.lang.String r2);

    @retrofit2.http.POST("app/appHealthStudentApply/getHealthStudentStatus")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> h0();

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/competeSign/competeUserSignUp")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> h1(@retrofit2.http.Field("itemId") java.lang.String r1, @retrofit2.http.Field("userId") java.lang.String r2);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/competeSign/getAppItemByUserAndCompetitionId")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> i(@retrofit2.http.Field("competionId") java.lang.String r1, @retrofit2.http.Field("userId") java.lang.String r2, @retrofit2.http.Field("pageSize") int r3, @retrofit2.http.Field("pageIndex") int r4);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/actOrder/addOrder")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> i0(@retrofit2.http.Field("uid") java.lang.String r1, @retrofit2.http.Field("id") java.lang.String r2);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/scheduleExamStu/stulist")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> i1(@retrofit2.http.Field("uid") java.lang.String r1);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/appCompetition/getMyAppCompetitionList")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> j(@retrofit2.http.Field("userId") java.lang.String r1);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/stuTeacherCurriculum/stuIgnIn")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> j0(@retrofit2.http.Field("stuTeacherCurriculum") java.lang.String r1);

    @retrofit2.http.POST("app/getStudentInfo")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> j1();

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/stuGymClockRecord/getStuAllGymClockRecords")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> k(@retrofit2.http.Field("userId") java.lang.String r1, @retrofit2.http.Field("sysTermId") java.lang.String r2, @retrofit2.http.Field("pageIndex") int r3, @retrofit2.http.Field("pageSize") int r4);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/appStuMeaSchedule/list2")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> k0(@retrofit2.http.Field("userId") java.lang.String r1, @retrofit2.http.Field("pageIndex") int r2, @retrofit2.http.Field("pageSize") int r3);

    @retrofit2.http.POST("app/appMeaNonStuApply/loadSysYears")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> k1();

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/appHealthStudentApply/getHealthStudentApplyList")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> l(@retrofit2.http.Field("userId") java.lang.String r1);

    @retrofit2.http.POST("app/getSources")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> l0();

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/appnotice/appListNoticeData")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> l1(@retrofit2.http.Field("userId") java.lang.String r1, @retrofit2.http.Field("identity") java.lang.String r2, @retrofit2.http.Field("pageIndex") int r3, @retrofit2.http.Field("pageSize") int r4);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("punch/loadPunchRecordWeekData1")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> m(@retrofit2.http.Field("userId") java.lang.String r1, @retrofit2.http.Field("termId") java.lang.String r2, @retrofit2.http.Field("pageIndex") int r3, @retrofit2.http.Field("pageSize") int r4);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/appStuForLeaveApply/loadStuTeacherCurriculumData")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> m0(@retrofit2.http.Field("userId") java.lang.String r1);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/stuTeacherCurriculum/selstuTeacherCurriculum")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> m1(@retrofit2.http.Field("stuid") java.lang.String r1, @retrofit2.http.Field("stuTermScoreid") java.lang.String r2);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/appStuForLeaveApply/getTermTotalScore")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> n(@retrofit2.http.Field("userId") java.lang.String r1, @retrofit2.http.Field("pageIndex") int r2, @retrofit2.http.Field("pageSize") int r3);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("punch/getTermWeekNum")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> n0(@retrofit2.http.Field("termId") java.lang.String r1);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("adminApp/gaugePoint/gainGaugePoint")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> n1(@retrofit2.http.Field("uid") java.lang.String r1, @retrofit2.http.Field("identify") java.lang.String r2);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/chooseCurriculum/showCurriculums")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> o(@retrofit2.http.Field("userId") java.lang.String r1, @retrofit2.http.Field("timeId") java.lang.String r2);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/stuTeacherCurriculum/deleteStuTeaCurr")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> o0(@retrofit2.http.Field("stuTeacherCurriculumid") java.lang.String r1);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/onlineExam/getExamOnlineStuPaperDetail")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> o1(@retrofit2.http.Field("stuId") java.lang.String r1, @retrofit2.http.Field("stuTeacherCurriculumId") java.lang.String r2, @retrofit2.http.Field("identify") java.lang.String r3);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/runingFace/isUpFaces")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> p(@retrofit2.http.Field("userId") java.lang.String r1);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/measure/getStuTotalScore")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> p0(@retrofit2.http.Field("userId") java.lang.String r1);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/appstu/getCheckInfo2RestPwd")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> p1(@retrofit2.http.Field("uname") java.lang.String r1);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/actOrder/actOrderListView")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> q(@retrofit2.http.Field("uid") java.lang.String r1, @retrofit2.http.Field("id") java.lang.String r2);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/appStuMeaSchedule/list3")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> q0(@retrofit2.http.Field("userId") java.lang.String r1, @retrofit2.http.Field("type") java.lang.String r2, @retrofit2.http.Field("pageIndex") int r3, @retrofit2.http.Field("pageSize") int r4);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/learnWork/saveWorkVoteOrWorkShare")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> q1(@retrofit2.http.Field("learnWorkId") java.lang.String r1, @retrofit2.http.Field("workType") int r2, @retrofit2.http.Field("workStatus") int r3);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/appstu/login")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> r(@retrofit2.http.Field("uname") java.lang.String r1, @retrofit2.http.Field("pwd") java.lang.String r2);

    @retrofit2.http.POST("app/announcementContent/appAnnouncementContentList")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> r0();

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/learnWork/getLearnWorkPagerList")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> r1(@retrofit2.http.Field("pageIndex") int r1, @retrofit2.http.Field("pageSize") int r2, @retrofit2.http.Field("learnQuestionName") java.lang.String r3);

    @retrofit2.http.POST("app/evaluate/loadTeachingAssessExplain")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> s();

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/stuGymClockRecord/getStuGymClockRecords")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> s0(@retrofit2.http.Field("userId") java.lang.String r1, @retrofit2.http.Field("sysTermId") java.lang.String r2, @retrofit2.http.Field("pageIndex") int r3, @retrofit2.http.Field("pageSize") int r4);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/stuPunchRecord/findPager")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> s1(@retrofit2.http.Field("userNum") java.lang.String r1, @retrofit2.http.Field("sysTermId") java.lang.String r2, @retrofit2.http.Field("pageIndex") int r3, @retrofit2.http.Field("pageSize") int r4);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/appStuMeaSchedule/getScheduleView")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> t(@retrofit2.http.Field("id") java.lang.String r1, @retrofit2.http.Field("userId") java.lang.String r2);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/appStuMeaSchedule/isMonitor")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> t0(@retrofit2.http.Field("userId") java.lang.String r1);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/appStuForLeaveApply/addStuLeaveCurriculumApply")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> t1(@retrofit2.http.Field("userId") java.lang.String r1, @retrofit2.http.Field("stuTeacherCurriculumId") java.lang.String r2, @retrofit2.http.Field("weekNum") java.lang.Integer r3, @retrofit2.http.Field("applyMemo") java.lang.String r4, @retrofit2.http.Field("fileNames") java.lang.String r5, @retrofit2.http.Field("imgs") java.lang.String r6);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/actOrder/del")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> u(@retrofit2.http.Field("uid") java.lang.String r1, @retrofit2.http.Field("id") java.lang.String r2);

    @retrofit2.http.POST("app/appMeaNonStuApply/loadMeaStatus")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> u0();

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/stuTeacherCurriculum/chooseTeachingCurriculum")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> u1(@retrofit2.http.Field("stuid") java.lang.String r1, @retrofit2.http.Field("teaCurriculumid") java.lang.String r2);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/validatePwdByUserId")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> v(@retrofit2.http.Field("userId") java.lang.String r1, @retrofit2.http.Field("pwd") java.lang.String r2);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/stuGymClockRecord/addStuGymClockRecord")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> v0(@retrofit2.http.Field("operatorID") java.lang.String r1, @retrofit2.http.Field("stuCardNum") java.lang.String r2, @retrofit2.http.Field("type") java.lang.String r3);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/chooseCurriculum/showTeachingCurriculum")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> v1(@retrofit2.http.Field("userId") java.lang.String r1, @retrofit2.http.Field("timeId") java.lang.String r2, @retrofit2.http.Field("parameter") java.lang.String r3, @retrofit2.http.Field("teachingId") java.lang.String r4, @retrofit2.http.Field("pageIndex") int r5, @retrofit2.http.Field("pageSize") int r6);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/appMeaNonStuApply/getMeaNonStuApplyRecordDetail")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> w(@retrofit2.http.Field("meaNonStuApplyId") java.lang.String r1);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/actOrder/pagerActOrder")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> w0(@retrofit2.http.Field("uid") java.lang.String r1, @retrofit2.http.Field("pageIndex") int r2, @retrofit2.http.Field("pageSize") int r3);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/changeUserPassword")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> w1(@retrofit2.http.Field("userNum") java.lang.String r1, @retrofit2.http.Field("pwd") java.lang.String r2);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/appHealthStudentApply/getHealthStudentApplyDetail")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> x(@retrofit2.http.Field("id") java.lang.String r1);

    @retrofit2.http.POST("app/learnWork/getLearnWorkProject")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> x0();

    @retrofit2.http.POST("app/getNations")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> x1();

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/getUserInfoCountByTel")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> y(@retrofit2.http.Field("phone") java.lang.String r1);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/appHealthStudentApply/applyHealthStudentApply")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> y0(@retrofit2.http.Field("userId") java.lang.String r1, @retrofit2.http.Field("applyMemo") java.lang.String r2, @retrofit2.http.Field("fileNames") java.lang.String r3, @retrofit2.http.Field("imgs") java.lang.String r4, @retrofit2.http.Field("type") java.lang.String r5);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/appMeaNonStuApply/cancelMeaNonStuApply")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> y1(@retrofit2.http.Field("id") java.lang.String r1);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/appStuMeaSchedule/viewMeaSpecification")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> z(@retrofit2.http.Field("type") java.lang.String r1, @retrofit2.http.Field("uid") java.lang.String r2);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/onlineExam/loadExamContentData")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> z0(@retrofit2.http.Field("stuTeacherCurriculumId") java.lang.String r1, @retrofit2.http.Field("teachingCurrIds") java.lang.String r2, @retrofit2.http.Field("userId") java.lang.String r3, @retrofit2.http.Field("onlineType") int r4);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST("app/onlineExam/saveExamPaper")
    rx.e<retrofit2.c0<okhttp3.ResponseBody>> z1(@retrofit2.http.Field("stuTeacherCurriculumId") java.lang.String r1, @retrofit2.http.Field("userId") java.lang.String r2, @retrofit2.http.Field("radio") java.lang.String r3, @retrofit2.http.Field("check") java.lang.String r4, @retrofit2.http.Field("quest") java.lang.String r5, @retrofit2.http.Field("startTime") java.lang.String r6, @retrofit2.http.Field("onlineType") int r7);
}
