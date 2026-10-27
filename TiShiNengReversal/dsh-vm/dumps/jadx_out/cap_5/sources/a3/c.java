package a3;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class c extends c3.a {
    public c() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // c3.a, a3.b
    public void b() {
            r6 = this;
            android.content.Context r0 = c3.a.a
            androidx.localbroadcastmanager.content.LocalBroadcastManager r0 = androidx.localbroadcastmanager.content.LocalBroadcastManager.getInstance(r0)
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r2 = "NOTIFY_HEART_CALLBACK_SUCCESS"
            r1.<init>(r2)
            r0.sendBroadcast(r1)
            r6.l()
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            r1 = 0
            r0.setLogin(r1)
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r1 = ""
            r0.setToken(r1)
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            r0.setUserId(r1)
            cn.bluemobi.dylan.base.utils.a r0 = cn.bluemobi.dylan.base.utils.a.n()
            r0.j()
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            int r0 = r0.getUserType()
            r1 = 1
            r2 = 335544320(0x14000000, float:6.4623485E-27)
            if (r0 != r1) goto L76
            android.content.Context r0 = c3.a.a
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            android.content.ComponentName r3 = new android.content.ComponentName
            java.lang.String r4 = "com.bxkj.student.MainActivity"
            java.lang.String r5 = "com.bxkj.student"
            r3.<init>(r5, r4)
            android.content.Intent r1 = r1.setComponent(r3)
            android.content.Intent r1 = r1.setFlags(r2)
            r0.startActivity(r1)
            android.content.Context r0 = c3.a.a
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            android.content.ComponentName r2 = new android.content.ComponentName
            java.lang.String r3 = "com.bxkj.student.personal.login.LoginActivity"
            r2.<init>(r5, r3)
            android.content.Intent r1 = r1.setComponent(r2)
            r2 = 268435456(0x10000000, float:2.524355E-29)
            android.content.Intent r1 = r1.setFlags(r2)
            r0.startActivity(r1)
            goto L91
        L76:
            android.content.Context r0 = c3.a.a
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            android.content.ComponentName r3 = new android.content.ComponentName
            java.lang.String r4 = "com.bxkj.teacher"
            java.lang.String r5 = "com.bxkj.teacher.login.LoginActivity"
            r3.<init>(r4, r5)
            android.content.Intent r1 = r1.setComponent(r3)
            android.content.Intent r1 = r1.setFlags(r2)
            r0.startActivity(r1)
        L91:
            android.content.Context r0 = c3.a.a
            java.lang.Class<com.bxkj.base.chat.heart.AlarmChatService> r1 = com.bxkj.base.chat.heart.AlarmChatService.class
            java.lang.String r2 = r1.getName()
            boolean r0 = com.bxkj.base.util.a0.a(r0, r2)
            if (r0 == 0) goto Lb0
            java.lang.String r0 = "AlarmChatService----------isServiceRunning"
            com.orhanobut.logger.j.c(r0)
            android.content.Context r0 = c3.a.a
            android.content.Intent r2 = new android.content.Intent
            android.content.Context r3 = c3.a.a
            r2.<init>(r3, r1)
            r0.stopService(r2)
        Lb0:
            return
    }

    @Override // c3.a, a3.b
    public void c(com.tsn.chat.model.ChatModel r5) {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "接收到聊天信息:"
            r0.append(r1)
            java.lang.String r1 = r5.toString()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.orhanobut.logger.j.c(r0)
            android.content.Context r0 = c3.a.a
            androidx.localbroadcastmanager.content.LocalBroadcastManager r0 = androidx.localbroadcastmanager.content.LocalBroadcastManager.getInstance(r0)
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r2 = "NOTIFY_RECEIVER_MESSAGE"
            r1.<init>(r2)
            java.lang.String r2 = "chatType"
            r3 = 1
            android.content.Intent r1 = r1.putExtra(r2, r3)
            java.lang.String r2 = "userId"
            java.lang.String r3 = r5.getFromUserId()
            android.content.Intent r1 = r1.putExtra(r2, r3)
            java.lang.String r2 = "userName"
            java.lang.String r3 = r5.getFromUserName()
            android.content.Intent r1 = r1.putExtra(r2, r3)
            java.lang.String r2 = "toUserName"
            java.lang.String r3 = r5.getToUserName()
            android.content.Intent r1 = r1.putExtra(r2, r3)
            java.lang.String r2 = "photo"
            java.lang.String r3 = r5.getPhoto()
            android.content.Intent r1 = r1.putExtra(r2, r3)
            java.lang.String r2 = "createTime"
            java.lang.String r3 = r5.getCreateTime()
            android.content.Intent r1 = r1.putExtra(r2, r3)
            java.lang.String r2 = "msg"
            java.lang.String r5 = r5.getMsg()
            android.content.Intent r5 = r1.putExtra(r2, r5)
            r0.sendBroadcast(r5)
            return
    }

    @Override // c3.a, a3.b
    public void e(java.lang.String r5) {
            r4 = this;
            cn.bluemobi.dylan.sqlitelibrary.c r0 = cn.bluemobi.dylan.sqlitelibrary.c.h()
            java.lang.String r1 = "messageId=?"
            java.lang.String[] r2 = new java.lang.String[]{r5}
            java.lang.Class<com.bxkj.base.chat.db.ChatMessageDb> r3 = com.bxkj.base.chat.db.ChatMessageDb.class
            r0.delete(r3, r1, r2)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "消息发送回调"
            r0.append(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            com.orhanobut.logger.j.c(r0)
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "NOTIFY_SEND_MESSAGE_CALLBACK_SUCCESS"
            r0.<init>(r1)
            java.lang.String r1 = "messageId"
            r0.putExtra(r1, r5)
            android.content.Context r1 = c3.a.a
            androidx.localbroadcastmanager.content.LocalBroadcastManager r1 = androidx.localbroadcastmanager.content.LocalBroadcastManager.getInstance(r1)
            r1.sendBroadcast(r0)
            super.e(r5)
            return
    }

    @Override // c3.a, a3.b
    public void f() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "心跳响应"
            r0.append(r1)
            android.content.Context r1 = c3.a.a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.orhanobut.logger.j.c(r0)
            android.content.Context r0 = c3.a.a
            androidx.localbroadcastmanager.content.LocalBroadcastManager r0 = androidx.localbroadcastmanager.content.LocalBroadcastManager.getInstance(r0)
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r2 = "NOTIFY_HEART_CALLBACK_SUCCESS"
            r1.<init>(r2)
            r0.sendBroadcast(r1)
            return
    }

    @Override // c3.a, a3.b
    public void j(com.tsn.chat.model.ChatModel r5) {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "接收到群聊信息:"
            r0.append(r1)
            java.lang.String r1 = r5.toString()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.orhanobut.logger.j.c(r0)
            android.content.Context r0 = c3.a.a
            androidx.localbroadcastmanager.content.LocalBroadcastManager r0 = androidx.localbroadcastmanager.content.LocalBroadcastManager.getInstance(r0)
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r2 = "NOTIFY_RECEIVER_MESSAGE"
            r1.<init>(r2)
            java.lang.String r2 = "chatType"
            r3 = 2
            android.content.Intent r1 = r1.putExtra(r2, r3)
            java.lang.String r2 = "userId"
            java.lang.String r3 = r5.getFromUserId()
            android.content.Intent r1 = r1.putExtra(r2, r3)
            java.lang.String r2 = "userName"
            java.lang.String r3 = r5.getFromUserName()
            android.content.Intent r1 = r1.putExtra(r2, r3)
            java.lang.String r2 = "toUserName"
            java.lang.String r3 = r5.getToUserName()
            android.content.Intent r1 = r1.putExtra(r2, r3)
            java.lang.String r2 = "photo"
            java.lang.String r3 = r5.getPhoto()
            android.content.Intent r1 = r1.putExtra(r2, r3)
            java.lang.String r2 = "createTime"
            java.lang.String r3 = r5.getCreateTime()
            android.content.Intent r1 = r1.putExtra(r2, r3)
            java.lang.String r2 = "groupId"
            java.lang.String r3 = r5.getGroupId()
            android.content.Intent r1 = r1.putExtra(r2, r3)
            java.lang.String r2 = "msg"
            java.lang.String r5 = r5.getMsg()
            android.content.Intent r5 = r1.putExtra(r2, r5)
            r0.sendBroadcast(r5)
            return
    }

    @Override // c3.a, a3.b
    public void k() {
            r1 = this;
            java.lang.String r0 = "客户端离线回调"
            com.orhanobut.logger.j.c(r0)
            return
    }
}
