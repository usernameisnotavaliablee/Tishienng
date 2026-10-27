package cn.jpush.android.g;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class b extends cn.asus.push.IAIDLCallback.Stub {
    public b() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // cn.asus.push.IAIDLCallback
    public final void call(cn.asus.push.DataBuffer r9) {
            r8 = this;
            java.lang.String r0 = "ClientAIDLCallBack"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L74
            java.lang.String r2 = "[call] data:"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L74
            java.lang.String r2 = java.lang.String.valueOf(r9)     // Catch: java.lang.Throwable -> L74
            r1.append(r2)     // Catch: java.lang.Throwable -> L74
            java.lang.String r2 = ",cmd:"
            r1.append(r2)     // Catch: java.lang.Throwable -> L74
            java.lang.String r2 = r9.a     // Catch: java.lang.Throwable -> L74
            r1.append(r2)     // Catch: java.lang.Throwable -> L74
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L74
            cn.jpush.android.i.b.a(r0, r1)     // Catch: java.lang.Throwable -> L74
            java.lang.String r6 = r9.a     // Catch: java.lang.Throwable -> L74
            android.os.Bundle r0 = r9.f3b     // Catch: java.lang.Throwable -> L74
            java.lang.String r1 = "message_rid"
            r2 = -1
            long r4 = r0.getLong(r1, r2)     // Catch: java.lang.Throwable -> L74
            android.os.Bundle r0 = r9.f3b     // Catch: java.lang.Throwable -> L74
            java.lang.String r1 = "message_content"
            java.lang.String r7 = r0.getString(r1)     // Catch: java.lang.Throwable -> L74
            android.content.Context r0 = cn.jpush.android.f.c.a     // Catch: java.lang.Throwable -> L74
            java.lang.String r0 = cn.jpush.android.f.c.b(r0)     // Catch: java.lang.Throwable -> L74
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L74
            if (r1 != 0) goto L52
            java.lang.Class r9 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L74
            java.lang.Object r9 = r9.newInstance()     // Catch: java.lang.Throwable -> L74
            r2 = r9
            cn.jiguang.push.asus.PushMessageReceiver r2 = (cn.jiguang.push.asus.PushMessageReceiver) r2     // Catch: java.lang.Throwable -> L74
            android.content.Context r3 = cn.jpush.android.f.c.a     // Catch: java.lang.Throwable -> L74
            r2.a(r3, r4, r6, r7)     // Catch: java.lang.Throwable -> L74
            return
        L52:
            android.content.Intent r0 = new android.content.Intent     // Catch: java.lang.Throwable -> L74
            r0.<init>()     // Catch: java.lang.Throwable -> L74
            android.os.Bundle r1 = r9.f3b     // Catch: java.lang.Throwable -> L74
            java.lang.String r2 = "message_cmd"
            java.lang.String r3 = r9.a     // Catch: java.lang.Throwable -> L74
            r1.putString(r2, r3)     // Catch: java.lang.Throwable -> L74
            android.os.Bundle r9 = r9.f3b     // Catch: java.lang.Throwable -> L74
            r0.putExtras(r9)     // Catch: java.lang.Throwable -> L74
            java.lang.String r9 = "com.ups.push.PUSH_RESPONSE"
            r0.setAction(r9)     // Catch: java.lang.Throwable -> L74
            java.lang.String r9 = cn.jpush.android.f.c.f1789c     // Catch: java.lang.Throwable -> L74
            r0.setPackage(r9)     // Catch: java.lang.Throwable -> L74
            android.content.Context r9 = cn.jpush.android.f.c.a     // Catch: java.lang.Throwable -> L74
            r9.sendBroadcast(r0)     // Catch: java.lang.Throwable -> L74
        L74:
            return
    }
}
