package com.bxkj.student.home.teaching.learning.question.list;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class QuestionListAdapter extends cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> {
    private com.bxkj.student.home.teaching.homework.question.list.QuestionListAdapter.b k;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.home.teaching.learning.question.list.QuestionListAdapter a;

        a(com.bxkj.student.home.teaching.learning.question.list.QuestionListAdapter r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r1) {
                r0 = this;
                com.bxkj.student.home.teaching.learning.question.list.QuestionListAdapter r1 = r0.a
                com.bxkj.student.home.teaching.homework.question.list.QuestionListAdapter$b r1 = com.bxkj.student.home.teaching.learning.question.list.QuestionListAdapter.p(r1)
                if (r1 == 0) goto L11
                com.bxkj.student.home.teaching.learning.question.list.QuestionListAdapter r1 = r0.a
                com.bxkj.student.home.teaching.homework.question.list.QuestionListAdapter$b r1 = com.bxkj.student.home.teaching.learning.question.list.QuestionListAdapter.p(r1)
                r1.onRefresh()
            L11:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface b {
        void onRefresh();
    }

    public QuestionListAdapter(android.content.Context r2, java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r3) {
            r1 = this;
            r0 = 2131493266(0x7f0c0192, float:1.8610007E38)
            r1.<init>(r2, r0, r3)
            return
    }

    public static /* synthetic */ void m(com.bxkj.student.home.teaching.learning.question.list.QuestionListAdapter r0, java.util.Map r1, android.view.View r2) {
            r0.s(r1, r2)
            return
    }

    public static /* synthetic */ void n(com.bxkj.student.home.teaching.learning.question.list.QuestionListAdapter r0, cn.bluemobi.dylan.base.adapter.common.ViewHolder r1, android.view.View r2) {
            r0.t(r1, r2)
            return
    }

    public static /* synthetic */ void o(com.bxkj.student.home.teaching.learning.question.list.QuestionListAdapter r0, java.util.Map r1) {
            r0.r(r1)
            return
    }

    static /* bridge */ /* synthetic */ com.bxkj.student.home.teaching.homework.question.list.QuestionListAdapter.b p(com.bxkj.student.home.teaching.learning.question.list.QuestionListAdapter r0) {
            com.bxkj.student.home.teaching.homework.question.list.QuestionListAdapter$b r0 = r0.k
            return r0
    }

    private /* synthetic */ void r(java.util.Map r4) {
            r3 = this;
            android.content.Context r0 = r3.e
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            java.lang.Class<com.bxkj.student.home.teaching.learning.m> r1 = com.bxkj.student.home.teaching.learning.m.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            com.bxkj.student.home.teaching.learning.m r1 = (com.bxkj.student.home.teaching.learning.m) r1
            java.lang.String r2 = "questionId"
            java.lang.String r4 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r2)
            rx.e r4 = r1.g(r4)
            cn.bluemobi.dylan.http.HttpRequest r4 = r0.setObservable(r4)
            com.bxkj.student.home.teaching.learning.question.list.QuestionListAdapter$a r0 = new com.bxkj.student.home.teaching.learning.question.list.QuestionListAdapter$a
            r0.<init>(r3)
            r4.setDataListener(r0)
            return
    }

    private /* synthetic */ void s(java.util.Map r2, android.view.View r3) {
            r1 = this;
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r3 = new cn.bluemobi.dylan.base.view.iOSTwoButtonDialog
            android.content.Context r0 = r1.e
            r3.<init>(r0)
            java.lang.String r0 = "确定要删除本次答案吗?删除后不可恢复,请谨慎操作"
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r3 = r3.setMessage(r0)
            com.bxkj.student.home.teaching.learning.question.list.e r0 = new com.bxkj.student.home.teaching.learning.question.list.e
            r0.<init>(r1, r2)
            cn.bluemobi.dylan.base.view.iOSTwoButtonDialog r2 = r3.setRightButtonOnClickListener(r0)
            r2.show()
            return
    }

    private /* synthetic */ void t(cn.bluemobi.dylan.base.adapter.common.ViewHolder r1, android.view.View r2) {
            r0 = this;
            int r1 = r1.f()
            r0.v(r1)
            return
    }

    public /* bridge */ /* synthetic */ void c(cn.bluemobi.dylan.base.adapter.common.ViewHolder r1, java.lang.Object r2) {
            r0 = this;
            java.util.Map r2 = (java.util.Map) r2
            r0.q(r1, r2)
            return
    }

    public void q(cn.bluemobi.dylan.base.adapter.common.ViewHolder r5, java.util.Map<java.lang.String, java.lang.Object> r6) {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r5.f()
            r2 = 1
            int r1 = r1 + r2
            r0.append(r1)
            java.lang.String r1 = "."
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 2131298944(0x7f090a80, float:1.8215875E38)
            r5.J(r1, r0)
            java.lang.String r0 = "questionTypeName"
            java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r0)
            r1 = 2131299171(0x7f090b63, float:1.8216336E38)
            r5.J(r1, r0)
            java.lang.String r0 = "questions"
            java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r0)
            r1 = 2131299058(0x7f090af2, float:1.8216107E38)
            android.view.View r1 = r5.h(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            com.bxkj.base.util.m.a(r1, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "满分："
            r0.append(r1)
            java.lang.String r1 = "socre"
            java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r1)
            r0.append(r1)
            java.lang.String r1 = "分"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 2131299093(0x7f090b15, float:1.8216178E38)
            r5.J(r1, r0)
            java.lang.String r0 = "isQualified"
            int r0 = cn.bluemobi.dylan.http.JsonParse.getInt(r6, r0)
            if (r0 != r2) goto L6f
            android.content.Context r1 = r4.e
            r3 = 2131099731(0x7f060053, float:1.7811823E38)
            int r1 = androidx.core.content.ContextCompat.getColor(r1, r3)
            goto L78
        L6f:
            android.content.Context r1 = r4.e
            r3 = 2131099730(0x7f060052, float:1.7811821E38)
            int r1 = androidx.core.content.ContextCompat.getColor(r1, r3)
        L78:
            r3 = 2131298984(0x7f090aa8, float:1.8215957E38)
            r5.K(r3, r1)
            java.lang.String r1 = "isQualifiedName"
            java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r1)
            r5.J(r3, r1)
            if (r0 != 0) goto L8c
            java.lang.String r1 = "开始答题"
            goto L8e
        L8c:
            java.lang.String r1 = "查看答案"
        L8e:
            r3 = 2131296584(0x7f090148, float:1.8211089E38)
            r5.J(r3, r1)
            r1 = 2
            if (r0 != r1) goto L98
            goto L99
        L98:
            r2 = 0
        L99:
            r0 = 2131296634(0x7f09017a, float:1.821119E38)
            r5.N(r0, r2)
            com.bxkj.student.home.teaching.learning.question.list.c r1 = new com.bxkj.student.home.teaching.learning.question.list.c
            r1.<init>(r4, r6)
            r5.w(r0, r1)
            com.bxkj.student.home.teaching.learning.question.list.d r6 = new com.bxkj.student.home.teaching.learning.question.list.d
            r6.<init>(r4, r5)
            r5.w(r3, r6)
            return
    }

    public void u(com.bxkj.student.home.teaching.homework.question.list.QuestionListAdapter.b r1) {
            r0 = this;
            r0.k = r1
            return
    }

    public void v(int r6) {
            r5 = this;
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.Object r1 = r5.getItem(r6)
            java.util.Map r1 = (java.util.Map) r1
            java.lang.String r2 = "id"
            java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r1, r2)
            java.lang.Object r2 = r5.getItem(r6)
            java.util.Map r2 = (java.util.Map) r2
            java.lang.String r3 = "questionId"
            java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r2, r3)
            boolean r4 = android.text.TextUtils.isEmpty(r1)
            if (r4 == 0) goto L24
            r1 = r2
        L24:
            r0.putExtra(r3, r1)
            java.lang.Object r1 = r5.getItem(r6)
            java.util.Map r1 = (java.util.Map) r1
            java.lang.String r2 = "isQualified"
            int r1 = cn.bluemobi.dylan.http.JsonParse.getInt(r1, r2)
            r0.putExtra(r2, r1)
            java.lang.Object r1 = r5.getItem(r6)
            java.util.Map r1 = (java.util.Map) r1
            java.lang.String r2 = "questionType"
            int r1 = cn.bluemobi.dylan.http.JsonParse.getInt(r1, r2)
            java.lang.Class<com.bxkj.student.home.teaching.learning.question.RadioQuestionActivity> r3 = com.bxkj.student.home.teaching.learning.question.RadioQuestionActivity.class
            if (r1 != 0) goto L4c
            android.content.Context r6 = r5.e
            r0.setClass(r6, r3)
            goto Lb2
        L4c:
            java.lang.Object r1 = r5.getItem(r6)
            java.util.Map r1 = (java.util.Map) r1
            int r1 = cn.bluemobi.dylan.http.JsonParse.getInt(r1, r2)
            r4 = 1
            if (r4 != r1) goto L61
            android.content.Context r6 = r5.e
            java.lang.Class<com.bxkj.student.home.teaching.learning.question.CheckboxQuestionActivity> r1 = com.bxkj.student.home.teaching.learning.question.CheckboxQuestionActivity.class
            r0.setClass(r6, r1)
            goto Lb2
        L61:
            java.lang.Object r1 = r5.getItem(r6)
            java.util.Map r1 = (java.util.Map) r1
            int r1 = cn.bluemobi.dylan.http.JsonParse.getInt(r1, r2)
            r4 = 2
            if (r4 != r1) goto L74
            android.content.Context r6 = r5.e
            r0.setClass(r6, r3)
            goto Lb2
        L74:
            java.lang.Object r1 = r5.getItem(r6)
            java.util.Map r1 = (java.util.Map) r1
            int r1 = cn.bluemobi.dylan.http.JsonParse.getInt(r1, r2)
            r3 = 3
            if (r3 != r1) goto L89
            android.content.Context r6 = r5.e
            java.lang.Class<com.bxkj.student.home.teaching.learning.question.TextQuestionActivity> r1 = com.bxkj.student.home.teaching.learning.question.TextQuestionActivity.class
            r0.setClass(r6, r1)
            goto Lb2
        L89:
            java.lang.Object r1 = r5.getItem(r6)
            java.util.Map r1 = (java.util.Map) r1
            int r1 = cn.bluemobi.dylan.http.JsonParse.getInt(r1, r2)
            r3 = 4
            if (r3 != r1) goto L9e
            android.content.Context r6 = r5.e
            java.lang.Class<com.bxkj.student.home.teaching.learning.question.ImageActivity> r1 = com.bxkj.student.home.teaching.learning.question.ImageActivity.class
            r0.setClass(r6, r1)
            goto Lb2
        L9e:
            java.lang.Object r6 = r5.getItem(r6)
            java.util.Map r6 = (java.util.Map) r6
            int r6 = cn.bluemobi.dylan.http.JsonParse.getInt(r6, r2)
            r1 = 5
            if (r1 != r6) goto Lb2
            android.content.Context r6 = r5.e
            java.lang.Class<com.bxkj.student.home.teaching.learning.question.VideoQuestionActivity> r1 = com.bxkj.student.home.teaching.learning.question.VideoQuestionActivity.class
            r0.setClass(r6, r1)
        Lb2:
            android.content.Context r6 = r5.e
            r6.startActivity(r0)
            return
    }
}
