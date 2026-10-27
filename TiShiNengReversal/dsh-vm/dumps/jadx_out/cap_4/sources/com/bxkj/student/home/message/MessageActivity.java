package com.bxkj.student.home.message;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class MessageActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private android.widget.TextView Y;
    private android.widget.TextView Z;

    public MessageActivity() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ void g0(com.bxkj.student.home.message.MessageActivity r0, android.view.View r1) {
            r0.h0(r1)
            return
    }

    private /* synthetic */ void h0(android.view.View r3) {
            r2 = this;
            android.content.Intent r3 = new android.content.Intent
            android.content.Context r0 = r2.V
            java.lang.Class<com.bxkj.base.chat.ConversationListActivity> r1 = com.bxkj.base.chat.ConversationListActivity.class
            r3.<init>(r0, r1)
            r2.startActivity(r3)
            return
    }

    public void L() {
            r2 = this;
            android.widget.TextView r0 = r2.Y
            r0.setOnClickListener(r2)
            android.widget.TextView r0 = r2.Z
            com.bxkj.student.home.message.a r1 = new com.bxkj.student.home.message.a
            r1.<init>(r2)
            r0.setOnClickListener(r1)
            return
    }

    protected int N() {
            r1 = this;
            r0 = 2131492975(0x7f0c006f, float:1.8609417E38)
            return r0
    }

    public void R() {
            r0 = this;
            return
    }

    public void S() {
            r1 = this;
            java.lang.String r0 = "消息"
            r1.setTitle(r0)
            return
    }

    public void T(android.os.Bundle r1) {
            r0 = this;
            r1 = 2131298995(0x7f090ab3, float:1.8215979E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.Y = r1
            r1 = 2131298828(0x7f090a0c, float:1.821564E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.Z = r1
            return
    }

    public void onClick(android.view.View r3) {
            r2 = this;
            int r3 = r3.getId()
            r0 = 2131298995(0x7f090ab3, float:1.8215979E38)
            if (r3 == r0) goto La
            return
        La:
            android.content.Intent r3 = new android.content.Intent
            android.content.Context r0 = r2.V
            java.lang.Class<com.bxkj.student.home.message.SystemMessageListActivity> r1 = com.bxkj.student.home.message.SystemMessageListActivity.class
            r3.<init>(r0, r1)
            r2.startActivity(r3)
            return
    }
}
