package cn.jiguang.push.asus;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class PushMessageReceiver extends android.content.BroadcastReceiver {
    private static java.util.concurrent.ExecutorService a;

    public PushMessageReceiver() {
            r0 = this;
            r0.<init>()
            return
    }

    private void a(android.content.Context r18, java.lang.String r19, long r20, org.json.JSONObject r22) {
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            r5 = r22
            java.lang.String r6 = "cmd_msg_result"
            boolean r7 = r5.has(r6)
            r8 = 5
            r9 = 2
            r10 = 1
            java.lang.String r11 = "PushMessageReceiver"
            r12 = 3
            r13 = 0
            if (r7 == 0) goto L44
            int r6 = r5.optInt(r6)
            if (r6 == 0) goto L3e
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r14 = "errorCode:"
            r7.<init>(r14)
            r7.append(r6)
            java.lang.String r7 = r7.toString()
            cn.jpush.android.i.b.c(r11, r7)
            if (r6 != r9) goto L35
            int r6 = cn.jpush.android.f.f.f1801d
            goto L3e
        L35:
            if (r6 != r8) goto L3a
            int r6 = cn.jpush.android.f.f.f1800c
            goto L3e
        L3a:
            if (r6 != r10) goto L3e
            int r6 = cn.jpush.android.f.f.f1804g
        L3e:
            cn.jpush.android.c.a r7 = new cn.jpush.android.c.a
            r7.<init>(r2, r6)
            goto L46
        L44:
            r7 = r13
            r6 = 3
        L46:
            java.lang.String r14 = "cmd_msg_result_content"
            boolean r15 = r5.has(r14)
            if (r15 == 0) goto L5d
            java.lang.String r14 = r5.getString(r14)
            org.json.JSONObject r15 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L58
            r15.<init>(r14)     // Catch: java.lang.Throwable -> L58
            goto L5a
        L58:
            r15 = r13
        L5a:
            if (r15 == 0) goto L5d
            goto L5e
        L5d:
            r15 = r5
        L5e:
            boolean r5 = android.text.TextUtils.isEmpty(r2)
            if (r5 == 0) goto L68
            r0.a(r1, r7)
            return
        L68:
            r2.getClass()
            int r5 = r2.hashCode()
            r14 = 0
            r16 = -1
            switch(r5) {
                case -530269543: goto Lac;
                case -129063684: goto La1;
                case -76940622: goto L96;
                case 685741602: goto L8b;
                case 1306253107: goto L80;
                case 2074046642: goto L77;
                default: goto L75;
            }
        L75:
            r8 = -1
            goto Lb6
        L77:
            java.lang.String r5 = "ups.turnOn"
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto Lb6
            goto L75
        L80:
            java.lang.String r5 = "ups.login"
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L89
            goto L75
        L89:
            r8 = 4
            goto Lb6
        L8b:
            java.lang.String r5 = "ups.pushStatus"
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L94
            goto L75
        L94:
            r8 = 3
            goto Lb6
        L96:
            java.lang.String r5 = "ups.unregister"
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L9f
            goto L75
        L9f:
            r8 = 2
            goto Lb6
        La1:
            java.lang.String r5 = "ups.turnOff"
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto Laa
            goto L75
        Laa:
            r8 = 1
            goto Lb6
        Lac:
            java.lang.String r5 = "ups.register"
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto Lb5
            goto L75
        Lb5:
            r8 = 0
        Lb6:
            java.lang.String r5 = "failed"
            java.lang.String r9 = ""
            switch(r8) {
                case 0: goto L126;
                case 1: goto L122;
                case 2: goto L102;
                case 3: goto Lee;
                case 4: goto Ld0;
                case 5: goto L122;
                default: goto Lbd;
            }
        Lbd:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "unkown cmd:"
            r1.<init>(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            cn.jpush.android.i.b.d(r11, r1)
            goto L16b
        Ld0:
            java.lang.String r2 = "logined"
            cn.jpush.android.i.b.b(r11, r2)
            java.lang.String r2 = cn.jpush.android.f.c.f1788b
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L16b
            java.lang.String r2 = cn.jpush.android.a.b.b(r1)
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L16b
            java.lang.String r2 = cn.jpush.android.f.c.f1788b
            cn.jpush.android.h.a.a(r1, r2, r13)
            goto L16b
        Lee:
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            java.lang.String r3 = "isPushStopped"
            boolean r4 = r15.optBoolean(r3, r14)
            r2.putBoolean(r3, r4)
            if (r7 == 0) goto L122
            r7.a(r2)
            goto L122
        L102:
            if (r6 != 0) goto L107
            cn.jpush.android.a.b.a(r9)
        L107:
            cn.jpush.android.f.b r1 = new cn.jpush.android.f.b
            r1.<init>(r2, r3)
            cn.jpush.android.e.a r2 = cn.jpush.android.f.a.a(r1)
            if (r2 == 0) goto L16b
            cn.jpush.android.f.a.b(r1)
            cn.jpush.android.e.b r1 = new cn.jpush.android.e.b
            if (r6 != 0) goto L11b
            java.lang.String r5 = "success"
        L11b:
            r1.<init>(r6, r9, r5)
            r2.a(r1)
            return
        L122:
            r0.a(r1, r7)
            return
        L126:
            java.lang.String r8 = "registrationId"
            java.lang.String r8 = r15.optString(r8, r9)
            cn.jpush.android.f.b r12 = new cn.jpush.android.f.b
            r12.<init>(r2, r3)
            cn.jpush.android.e.a r2 = cn.jpush.android.f.a.a(r12)
            if (r2 == 0) goto L13a
            cn.jpush.android.f.a.b(r12)
        L13a:
            boolean r3 = android.text.TextUtils.isEmpty(r8)
            if (r3 != 0) goto L158
            java.lang.String r3 = "register succ."
            cn.jpush.android.i.b.b(r11, r3)
            if (r2 == 0) goto L151
            cn.jpush.android.e.b r3 = new cn.jpush.android.e.b
            java.lang.String r4 = "successs"
            r3.<init>(r14, r8, r4)
            r2.a(r3)
        L151:
            r0.a(r1, r8)
            cn.jpush.android.a.b.a(r8)
            return
        L158:
            if (r6 == r10) goto L16b
            r0.a(r1, r7)
            if (r2 == 0) goto L16b
            cn.jpush.android.e.b r1 = new cn.jpush.android.e.b
            int r3 = r7.a()
            r1.<init>(r3, r9, r5)
            r2.a(r1)
        L16b:
            return
    }

    public void a(android.content.Context r9, long r10, java.lang.String r12, java.lang.String r13) {
            r8 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "receive cmd:"
            r0.<init>(r1)
            r0.append(r12)
            java.lang.String r1 = ",rid:"
            r0.append(r1)
            r0.append(r10)
            java.lang.String r1 = ",content:"
            r0.append(r1)
            r0.append(r13)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "PushMessageReceiver"
            cn.jpush.android.i.b.a(r1, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r13)
            if (r0 != 0) goto L30
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L30
            r0.<init>(r13)     // Catch: org.json.JSONException -> L30
        L2e:
            r7 = r0
            goto L32
        L30:
            r0 = 0
            goto L2e
        L32:
            if (r7 != 0) goto L3a
            java.lang.String r9 = "handle json null"
            cn.jpush.android.i.b.g(r1, r9)
            return
        L3a:
            r2 = r8
            r3 = r9
            r5 = r10
            r4 = r12
            r2.a(r3, r4, r5, r7)     // Catch: java.lang.Throwable -> L41
        L41:
            return
    }

    protected final void a(android.content.Context r8, android.content.Intent r9) {
            r7 = this;
            java.lang.String r0 = r9.getAction()
            java.lang.String r1 = "com.ups.push.PUSH_RESPONSE"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L25
            java.lang.String r0 = "message_cmd"
            java.lang.String r5 = r9.getStringExtra(r0)
            java.lang.String r0 = "message_rid"
            r1 = -1
            long r3 = r9.getLongExtra(r0, r1)
            java.lang.String r0 = "message_content"
            java.lang.String r6 = r9.getStringExtra(r0)
            r1 = r7
            r2 = r8
            r1.a(r2, r3, r5, r6)
        L25:
            return
    }

    public abstract void a(android.content.Context r1, cn.jpush.android.c.a r2);

    public abstract void a(android.content.Context r1, java.lang.String r2);

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context r3, android.content.Intent r4) {
            r2 = this;
            java.util.concurrent.ExecutorService r0 = cn.jiguang.push.asus.PushMessageReceiver.a
            if (r0 != 0) goto La
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newSingleThreadExecutor()
            cn.jiguang.push.asus.PushMessageReceiver.a = r0
        La:
            java.util.concurrent.ExecutorService r0 = cn.jiguang.push.asus.PushMessageReceiver.a
            cn.jiguang.push.asus.a r1 = new cn.jiguang.push.asus.a
            r1.<init>(r2, r3, r4)
            r0.execute(r1)
            return
    }
}
