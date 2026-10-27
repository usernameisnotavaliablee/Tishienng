package com.bxkj.student.run.app.exam;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nQuestionActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QuestionActivity.kt\ncom/bxkj/student/run/app/exam/QuestionActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,94:1\n1869#2,2:95\n*S KotlinDebug\n*F\n+ 1 QuestionActivity.kt\ncom/bxkj/student/run/app/exam/QuestionActivity\n*L\n49#1:95,2\n*E\n"})
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class QuestionActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.bxkj.student.databinding.AcRunQuestionBinding O;
    private com.bxkj.student.run.app.exam.QuestionVieModel P;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.run.app.exam.QuestionActivity a;

        a(com.bxkj.student.run.app.exam.QuestionActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r6) {
                r5 = this;
                java.lang.String r0 = "data"
                java.util.List r6 = cn.bluemobi.dylan.http.JsonParse.getList(r6, r0)
                if (r6 == 0) goto L8d
                int r0 = r6.size()
                if (r0 <= 0) goto L8d
                com.bxkj.student.run.app.exam.QuestionActivity r0 = r5.a
                com.bxkj.student.run.app.exam.QuestionVieModel r0 = com.bxkj.student.run.app.exam.QuestionActivity.g(r0)
                java.lang.String r1 = "mViewModel"
                r2 = 0
                if (r0 != 0) goto L1d
                kotlin.jvm.internal.g0.S(r1)
                r0 = r2
            L1d:
                androidx.databinding.ObservableArrayMap r0 = r0.g()
                r3 = 0
                java.lang.Object r4 = r6.get(r3)
                java.util.Map r4 = (java.util.Map) r4
                r0.putAll(r4)
                com.bxkj.student.run.app.exam.QuestionActivity r0 = r5.a
                com.bxkj.student.run.app.exam.QuestionVieModel r0 = com.bxkj.student.run.app.exam.QuestionActivity.g(r0)
                if (r0 != 0) goto L37
                kotlin.jvm.internal.g0.S(r1)
                r0 = r2
            L37:
                androidx.databinding.ObservableArrayList r0 = r0.e()
                java.lang.Object r6 = r6.get(r3)
                java.util.Map r6 = (java.util.Map) r6
                java.lang.String r3 = "answers"
                java.util.List r6 = cn.bluemobi.dylan.http.JsonParse.getList(r6, r3)
                java.util.Collection r6 = (java.util.Collection) r6
                r0.addAll(r6)
                com.bxkj.student.run.app.exam.QuestionActivity r6 = r5.a
                com.bxkj.student.databinding.AcRunQuestionBinding r6 = com.bxkj.student.run.app.exam.QuestionActivity.f(r6)
                java.lang.String r0 = "mDataBinding"
                if (r6 != 0) goto L5a
                kotlin.jvm.internal.g0.S(r0)
                r6 = r2
            L5a:
                com.bxkj.student.run.app.exam.QuestionActivity r3 = r5.a
                com.bxkj.student.run.app.exam.QuestionVieModel r3 = com.bxkj.student.run.app.exam.QuestionActivity.g(r3)
                if (r3 != 0) goto L66
                kotlin.jvm.internal.g0.S(r1)
                r3 = r2
            L66:
                androidx.databinding.ObservableArrayMap r3 = r3.g()
                r6.setData(r3)
                com.bxkj.student.run.app.exam.QuestionActivity r6 = r5.a
                com.bxkj.student.databinding.AcRunQuestionBinding r6 = com.bxkj.student.run.app.exam.QuestionActivity.f(r6)
                if (r6 != 0) goto L79
                kotlin.jvm.internal.g0.S(r0)
                r6 = r2
            L79:
                com.bxkj.student.run.app.exam.QuestionActivity r0 = r5.a
                com.bxkj.student.run.app.exam.QuestionVieModel r0 = com.bxkj.student.run.app.exam.QuestionActivity.g(r0)
                if (r0 != 0) goto L85
                kotlin.jvm.internal.g0.S(r1)
                goto L86
            L85:
                r2 = r0
            L86:
                androidx.databinding.ObservableArrayList r0 = r2.e()
                r6.setAnswer(r0)
            L8d:
                return
        }
    }

    static {
            r0 = 17106(0x42d2, float:2.397E-41)
            com.stub.StubApp.interface11(r0)
            return
    }

    public QuestionActivity() {
            r0 = this;
            r0.<init>()
            return
    }

    private final void M() {
            r2 = this;
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r2)
            java.lang.Class<d0.a> r1 = d0.a.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            d0.a r1 = (d0.a) r1
            rx.e r1 = r1.f0()
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.student.run.app.exam.QuestionActivity$a r1 = new com.bxkj.student.run.app.exam.QuestionActivity$a
            r1.<init>(r2)
            r0.setDataListener(r1)
            return
    }

    private final java.lang.String N() {
            r4 = this;
            com.bxkj.student.run.app.exam.QuestionVieModel r0 = r4.P
            if (r0 != 0) goto La
            java.lang.String r0 = "mViewModel"
            kotlin.jvm.internal.g0.S(r0)
            r0 = 0
        La:
            androidx.databinding.ObservableArrayList r0 = r0.e()
            java.util.Iterator r0 = r0.iterator()
            java.lang.String r1 = ""
        L14:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L40
            java.lang.Object r2 = r0.next()
            java.util.Map r2 = (java.util.Map) r2
            java.lang.String r3 = "isRight"
            int r3 = cn.bluemobi.dylan.http.JsonParse.getInt(r2, r3)
            if (r3 != 0) goto L14
            java.lang.String r1 = "mark"
            java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r2, r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "正确答案："
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            goto L14
        L40:
            return r1
    }

    private static final void O(com.bxkj.student.run.app.exam.QuestionActivity r4, android.widget.RadioGroup r5, int r6) {
            com.bxkj.student.run.app.exam.QuestionVieModel r5 = r4.P
            java.lang.String r0 = "mViewModel"
            r1 = 0
            if (r5 != 0) goto Lb
            kotlin.jvm.internal.g0.S(r0)
            r5 = r1
        Lb:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r5.i(r6)
            com.bxkj.student.databinding.AcRunQuestionBinding r5 = r4.O
            java.lang.String r6 = "mDataBinding"
            if (r5 != 0) goto L1c
            kotlin.jvm.internal.g0.S(r6)
            r5 = r1
        L1c:
            android.widget.RadioGroup r5 = r5.rgAnswer
            com.bxkj.student.databinding.AcRunQuestionBinding r2 = r4.O
            if (r2 != 0) goto L26
            kotlin.jvm.internal.g0.S(r6)
            r2 = r1
        L26:
            android.widget.RadioGroup r2 = r2.rgAnswer
            com.bxkj.student.run.app.exam.QuestionVieModel r3 = r4.P
            if (r3 != 0) goto L30
            kotlin.jvm.internal.g0.S(r0)
            r3 = r1
        L30:
            java.lang.Integer r3 = r3.f()
            kotlin.jvm.internal.g0.m(r3)
            int r3 = r3.intValue()
            android.view.View r2 = r2.findViewById(r3)
            int r5 = r5.indexOfChild(r2)
            com.bxkj.student.run.app.exam.QuestionVieModel r2 = r4.P
            if (r2 != 0) goto L4b
            kotlin.jvm.internal.g0.S(r0)
            r2 = r1
        L4b:
            androidx.databinding.ObservableArrayList r0 = r2.e()
            java.lang.Object r5 = r0.get(r5)
            java.util.Map r5 = (java.util.Map) r5
            java.lang.String r0 = "isRight"
            java.lang.Object r5 = r5.get(r0)
            java.lang.String r5 = java.lang.String.valueOf(r5)
            int r5 = java.lang.Integer.parseInt(r5)
            r0 = 1
            if (r5 != r0) goto L87
            com.bxkj.student.databinding.AcRunQuestionBinding r5 = r4.O
            if (r5 != 0) goto L6e
            kotlin.jvm.internal.g0.S(r6)
            r5 = r1
        L6e:
            android.widget.TextView r5 = r5.tvRightAnswer
            java.lang.String r0 = r4.N()
            r5.setText(r0)
            com.bxkj.student.databinding.AcRunQuestionBinding r4 = r4.O
            if (r4 != 0) goto L7f
            kotlin.jvm.internal.g0.S(r6)
            goto L80
        L7f:
            r1 = r4
        L80:
            android.widget.TextView r4 = r1.tvRightAnswer
            r5 = 0
            r4.setVisibility(r5)
            return
        L87:
            com.bxkj.student.databinding.AcRunQuestionBinding r4 = r4.O
            if (r4 != 0) goto L8f
            kotlin.jvm.internal.g0.S(r6)
            goto L90
        L8f:
            r1 = r4
        L90:
            android.widget.TextView r4 = r1.tvRightAnswer
            r5 = 8
            r4.setVisibility(r5)
            return
    }

    public static /* synthetic */ void e(com.bxkj.student.run.app.exam.QuestionActivity r0, android.widget.RadioGroup r1, int r2) {
            O(r0, r1, r2)
            return
    }

    public static final /* synthetic */ com.bxkj.student.databinding.AcRunQuestionBinding f(com.bxkj.student.run.app.exam.QuestionActivity r0) {
            com.bxkj.student.databinding.AcRunQuestionBinding r0 = r0.O
            return r0
    }

    public static final /* synthetic */ com.bxkj.student.run.app.exam.QuestionVieModel g(com.bxkj.student.run.app.exam.QuestionActivity r0) {
            com.bxkj.student.run.app.exam.QuestionVieModel r0 = r0.P
            return r0
    }

    public final void L() {
            r5 = this;
            com.bxkj.student.run.app.exam.QuestionVieModel r0 = r5.P
            java.lang.String r1 = "mViewModel"
            r2 = 0
            if (r0 != 0) goto Lb
            kotlin.jvm.internal.g0.S(r1)
            r0 = r2
        Lb:
            java.lang.Integer r0 = r0.f()
            if (r0 != 0) goto L20
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
            r0.<init>(r5)
            java.lang.String r1 = "请选择答案"
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = r0.setMessage(r1)
            r0.show()
            return
        L20:
            com.bxkj.student.databinding.AcRunQuestionBinding r0 = r5.O
            java.lang.String r3 = "mDataBinding"
            if (r0 != 0) goto L2a
            kotlin.jvm.internal.g0.S(r3)
            r0 = r2
        L2a:
            android.widget.RadioGroup r0 = r0.rgAnswer
            com.bxkj.student.databinding.AcRunQuestionBinding r4 = r5.O
            if (r4 != 0) goto L34
            kotlin.jvm.internal.g0.S(r3)
            r4 = r2
        L34:
            android.widget.RadioGroup r3 = r4.rgAnswer
            com.bxkj.student.run.app.exam.QuestionVieModel r4 = r5.P
            if (r4 != 0) goto L3e
            kotlin.jvm.internal.g0.S(r1)
            r4 = r2
        L3e:
            java.lang.Integer r4 = r4.f()
            kotlin.jvm.internal.g0.m(r4)
            int r4 = r4.intValue()
            android.view.View r3 = r3.findViewById(r4)
            int r0 = r0.indexOfChild(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "indexOfChild="
            r3.append(r4)
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            r4 = 0
            java.lang.Object[] r4 = new java.lang.Object[r4]
            com.orhanobut.logger.j.d(r3, r4)
            com.bxkj.student.run.app.exam.QuestionVieModel r3 = r5.P
            if (r3 != 0) goto L70
            kotlin.jvm.internal.g0.S(r1)
            goto L71
        L70:
            r2 = r3
        L71:
            androidx.databinding.ObservableArrayList r1 = r2.e()
            if (r1 == 0) goto La4
            java.lang.Object r0 = r1.get(r0)
            java.util.Map r0 = (java.util.Map) r0
            java.lang.String r1 = "isRight"
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r0 = java.lang.Integer.parseInt(r0)
            r1 = 1
            if (r0 != r1) goto L9d
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
            r0.<init>(r5)
            java.lang.String r1 = "答案错误"
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = r0.setMessage(r1)
            r0.show()
            return
        L9d:
            r0 = -1
            r5.setResult(r0)
            r5.finish()
        La4:
            return
    }

    protected native void onCreate(@org.jetbrains.annotations.Nullable android.os.Bundle r1);
}
