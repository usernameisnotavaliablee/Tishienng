package com.bxkj.student.home.teaching.exam;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class FaceDetectExamActivity extends com.bxkj.student.run.app.face.FaceDetectExpActivity {
    private int T;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.home.teaching.exam.FaceDetectExamActivity a;

        a(com.bxkj.student.home.teaching.exam.FaceDetectExamActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public static /* synthetic */ void a(com.bxkj.student.home.teaching.exam.FaceDetectExamActivity.a r0, android.view.View r1) {
                r0.d(r1)
                return
        }

        public static /* synthetic */ void b(com.bxkj.student.home.teaching.exam.FaceDetectExamActivity.a r0, android.view.View r1) {
                r0.c(r1)
                return
        }

        private /* synthetic */ void c(android.view.View r1) {
                r0 = this;
                com.bxkj.student.home.teaching.exam.FaceDetectExamActivity r1 = r0.a
                r1.M()
                return
        }

        private /* synthetic */ void d(android.view.View r1) {
                r0 = this;
                com.bxkj.student.home.teaching.exam.FaceDetectExamActivity r1 = r0.a
                r1.M()
                return
        }

        public void netOnFailure(java.lang.Throwable r2) {
                r1 = this;
                super.netOnFailure(r2)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
                com.bxkj.student.home.teaching.exam.FaceDetectExamActivity r0 = r1.a
                android.content.Context r0 = com.bxkj.student.home.teaching.exam.FaceDetectExamActivity.S(r0)
                r2.<init>(r0)
                java.lang.String r0 = "人脸识别失败，请重新再试"
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = r2.setMessage(r0)
                com.bxkj.student.home.teaching.exam.e r0 = new com.bxkj.student.home.teaching.exam.e
                r0.<init>(r1)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = r2.setButtonOnClickListener(r0)
                r2.show()
                return
        }

        public void netOnOtherStatus(int r2, java.lang.String r3) {
                r1 = this;
                super.netOnOtherStatus(r2, r3)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
                com.bxkj.student.home.teaching.exam.FaceDetectExamActivity r0 = r1.a
                android.content.Context r0 = com.bxkj.student.home.teaching.exam.FaceDetectExamActivity.R(r0)
                r2.<init>(r0)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = r2.setMessage(r3)
                com.bxkj.student.home.teaching.exam.d r3 = new com.bxkj.student.home.teaching.exam.d
                r3.<init>(r1)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = r2.setButtonOnClickListener(r3)
                r2.show()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r3) {
                r2 = this;
                android.content.Intent r3 = new android.content.Intent
                com.bxkj.student.home.teaching.exam.FaceDetectExamActivity r0 = r2.a
                android.content.Context r0 = com.bxkj.student.home.teaching.exam.FaceDetectExamActivity.Q(r0)
                java.lang.Class<com.bxkj.student.home.teaching.exam.formal.ExamActivity> r1 = com.bxkj.student.home.teaching.exam.formal.ExamActivity.class
                r3.<init>(r0, r1)
                com.bxkj.student.home.teaching.exam.FaceDetectExamActivity r0 = r2.a
                int r0 = com.bxkj.student.home.teaching.exam.FaceDetectExamActivity.P(r0)
                java.lang.String r1 = "faceIndex"
                r3.putExtra(r1, r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "setResult-faceIndex="
                r0.append(r1)
                com.bxkj.student.home.teaching.exam.FaceDetectExamActivity r1 = r2.a
                int r1 = com.bxkj.student.home.teaching.exam.FaceDetectExamActivity.P(r1)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                com.orhanobut.logger.j.c(r0)
                com.bxkj.student.home.teaching.exam.FaceDetectExamActivity r0 = r2.a
                r1 = 187(0xbb, float:2.62E-43)
                r0.setResult(r1, r3)
                com.bxkj.student.home.teaching.exam.FaceDetectExamActivity r3 = r2.a
                r3.finish()
                return
        }
    }

    static {
            r0 = 16173(0x3f2d, float:2.2663E-41)
            com.stub.StubApp.interface11(r0)
            return
    }

    public FaceDetectExamActivity() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.T = r0
            return
    }

    static /* bridge */ /* synthetic */ int P(com.bxkj.student.home.teaching.exam.FaceDetectExamActivity r0) {
            int r0 = r0.T
            return r0
    }

    static /* synthetic */ android.content.Context Q(com.bxkj.student.home.teaching.exam.FaceDetectExamActivity r0) {
            android.content.Context r0 = r0.O
            return r0
    }

    static /* synthetic */ android.content.Context R(com.bxkj.student.home.teaching.exam.FaceDetectExamActivity r0) {
            android.content.Context r0 = r0.O
            return r0
    }

    static /* synthetic */ android.content.Context S(com.bxkj.student.home.teaching.exam.FaceDetectExamActivity r0) {
            android.content.Context r0 = r0.O
            return r0
    }

    @Override // com.bxkj.student.run.app.face.FaceDetectExpActivity
    protected void M() {
            r3 = this;
            android.content.Intent r0 = new android.content.Intent
            android.content.Context r1 = r3.O
            java.lang.Class<com.bxkj.student.home.teaching.exam.formal.ExamActivity> r2 = com.bxkj.student.home.teaching.exam.formal.ExamActivity.class
            r0.<init>(r1, r2)
            java.lang.String r1 = "faceIndex"
            int r2 = r3.T
            r0.putExtra(r1, r2)
            r1 = 170(0xaa, float:2.38E-43)
            r3.setResult(r1, r0)
            r3.finish()
            return
    }

    @Override // com.bxkj.student.run.app.face.FaceDetectExpActivity
    protected void e(java.lang.String r4) {
            r3 = this;
            android.content.Context r0 = r3.O
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.hideOtherStatusMessage()
            java.lang.Class<d0.a> r1 = d0.a.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            d0.a r1 = (d0.a) r1
            com.bxkj.base.user.LoginUser r2 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r2 = r2.getAccount()
            rx.e r4 = r1.F0(r4, r2)
            cn.bluemobi.dylan.http.HttpRequest r4 = r0.setObservable(r4)
            com.bxkj.student.home.teaching.exam.FaceDetectExamActivity$a r0 = new com.bxkj.student.home.teaching.exam.FaceDetectExamActivity$a
            r0.<init>(r3)
            r4.setDataListener(r0)
            return
    }

    @Override // com.bxkj.student.run.app.face.FaceDetectExpActivity
    public native void onCreate(android.os.Bundle r1);
}
