package com.huawei.hms.hatool;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class q1 {
    private java.lang.String a;
    public com.huawei.hms.hatool.k0 b;

    public q1(java.lang.String r3) {
            r2 = this;
            r2.<init>()
            r2.a = r3
            com.huawei.hms.hatool.k0 r0 = new com.huawei.hms.hatool.k0
            r0.<init>(r3)
            r2.b = r0
            com.huawei.hms.hatool.d1 r3 = com.huawei.hms.hatool.d1.e()
            java.lang.String r0 = r2.a
            com.huawei.hms.hatool.k0 r1 = r2.b
            r3.c(r0, r1)
            return
    }

    private com.huawei.hms.hatool.c1 e(int r2) {
            r1 = this;
            if (r2 == 0) goto L22
            r0 = 1
            if (r2 == r0) goto L1b
            r0 = 2
            if (r2 == r0) goto L14
            r0 = 3
            if (r2 == r0) goto Ld
            r2 = 0
            return r2
        Ld:
            com.huawei.hms.hatool.k0 r2 = r1.b
            com.huawei.hms.hatool.c1 r2 = r2.a()
            return r2
        L14:
            com.huawei.hms.hatool.k0 r2 = r1.b
            com.huawei.hms.hatool.c1 r2 = r2.g()
            return r2
        L1b:
            com.huawei.hms.hatool.k0 r2 = r1.b
            com.huawei.hms.hatool.c1 r2 = r2.d()
            return r2
        L22:
            com.huawei.hms.hatool.k0 r2 = r1.b
            com.huawei.hms.hatool.c1 r2 = r2.f()
            return r2
    }

    private boolean h(int r5) {
            r4 = this;
            r0 = 2
            r1 = 1
            r2 = 0
            java.lang.String r3 = "hmsSdk"
            if (r5 != r0) goto L18
            java.lang.String r5 = r4.a
            java.lang.String r0 = "_default_config_tag"
            boolean r5 = r0.equals(r5)
            if (r5 != 0) goto L17
            java.lang.String r5 = "verifyURL(): type: preins. Only default config can report Pre-install data."
        L13:
            com.huawei.hms.hatool.j1.l(r3, r5)
            return r2
        L17:
            return r1
        L18:
            com.huawei.hms.hatool.c1 r0 = r4.e(r5)
            if (r0 == 0) goto L2a
            java.lang.String r0 = r0.x()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L29
            goto L2a
        L29:
            return r1
        L2a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "verifyURL(): URL check failed. type: "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            goto L13
    }

    public void a(int r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "onReport. TAG: "
            r0.append(r1)
            java.lang.String r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", TYPE: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "hmsSdk"
            com.huawei.hms.hatool.j1.j(r1, r0)
            com.huawei.hms.hatool.t r0 = com.huawei.hms.hatool.t.a()
            java.lang.String r1 = r2.a
            r0.d(r1, r3)
            return
    }

    public void b(int r4, java.lang.String r5, java.util.LinkedHashMap<java.lang.String, java.lang.String> r6) {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "onEvent. TAG: "
            r0.append(r1)
            java.lang.String r1 = r3.a
            r0.append(r1)
            java.lang.String r1 = ", TYPE: "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r2 = ", eventId : "
            r0.append(r2)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "hmsSdk"
            com.huawei.hms.hatool.j1.j(r2, r0)
            boolean r0 = com.huawei.hms.hatool.n.b(r5)
            if (r0 != 0) goto L62
            boolean r0 = r3.h(r4)
            if (r0 != 0) goto L35
            goto L62
        L35:
            boolean r0 = com.huawei.hms.hatool.n.e(r6)
            if (r0 != 0) goto L58
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "onEvent() parameter mapValue will be cleared.TAG: "
            r6.append(r0)
            java.lang.String r0 = r3.a
            r6.append(r0)
            r6.append(r1)
            r6.append(r4)
            java.lang.String r6 = r6.toString()
            com.huawei.hms.hatool.j1.l(r2, r6)
            r6 = 0
        L58:
            com.huawei.hms.hatool.t r0 = com.huawei.hms.hatool.t.a()
            java.lang.String r1 = r3.a
            r0.e(r1, r4, r5, r6)
            return
        L62:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "onEvent() parameters check fail. Nothing will be recorded.TAG: "
            r5.append(r6)
            java.lang.String r6 = r3.a
            r5.append(r6)
            r5.append(r1)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            com.huawei.hms.hatool.j1.l(r2, r4)
            return
    }

    public void c(android.content.Context r4, java.lang.String r5, java.lang.String r6) {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "onEvent(context). TAG: "
            r0.append(r1)
            java.lang.String r1 = r3.a
            r0.append(r1)
            java.lang.String r1 = ", eventId : "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "hmsSdk"
            com.huawei.hms.hatool.j1.j(r1, r0)
            if (r4 != 0) goto L28
            java.lang.String r4 = "context is null in onevent "
            com.huawei.hms.hatool.j1.l(r1, r4)
            return
        L28:
            boolean r0 = com.huawei.hms.hatool.n.b(r5)
            if (r0 != 0) goto L62
            r0 = 0
            boolean r0 = r3.h(r0)
            if (r0 != 0) goto L36
            goto L62
        L36:
            java.lang.String r0 = "value"
            r2 = 65536(0x10000, float:9.1835E-41)
            boolean r0 = com.huawei.hms.hatool.n.c(r0, r6, r2)
            if (r0 != 0) goto L58
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "onEvent() parameter VALUE is overlong, content will be cleared.TAG: "
            r6.append(r0)
            java.lang.String r0 = r3.a
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            com.huawei.hms.hatool.j1.l(r1, r6)
            java.lang.String r6 = ""
        L58:
            com.huawei.hms.hatool.t r0 = com.huawei.hms.hatool.t.a()
            java.lang.String r1 = r3.a
            r0.f(r1, r4, r5, r6)
            return
        L62:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "onEvent() parameters check fail. Nothing will be recorded.TAG: "
            r4.append(r5)
            java.lang.String r5 = r3.a
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.huawei.hms.hatool.j1.l(r1, r4)
            return
    }

    public void d(com.huawei.hms.hatool.c1 r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "HiAnalyticsInstanceImpl.setMaintConf() is executed.TAG : "
            r0.append(r1)
            java.lang.String r1 = r2.a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "hmsSdk"
            com.huawei.hms.hatool.j1.h(r1, r0)
            if (r3 != 0) goto L26
            java.lang.String r3 = "HiAnalyticsInstanceImpl.setMaintConf(): config for maint is null!"
            com.huawei.hms.hatool.j1.l(r1, r3)
            com.huawei.hms.hatool.k0 r3 = r2.b
            r0 = 0
            r3.c(r0)
            return
        L26:
            com.huawei.hms.hatool.k0 r0 = r2.b
            r0.c(r3)
            return
    }

    public void f(int r4, java.lang.String r5, java.util.LinkedHashMap<java.lang.String, java.lang.String> r6) {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "onStreamEvent. TAG: "
            r0.append(r1)
            java.lang.String r1 = r3.a
            r0.append(r1)
            java.lang.String r1 = ", TYPE: "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r2 = ", eventId : "
            r0.append(r2)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "hmsSdk"
            com.huawei.hms.hatool.j1.j(r2, r0)
            boolean r0 = com.huawei.hms.hatool.n.b(r5)
            if (r0 != 0) goto L62
            boolean r0 = r3.h(r4)
            if (r0 != 0) goto L35
            goto L62
        L35:
            boolean r0 = com.huawei.hms.hatool.n.e(r6)
            if (r0 != 0) goto L58
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "onStreamEvent() parameter mapValue will be cleared.TAG: "
            r6.append(r0)
            java.lang.String r0 = r3.a
            r6.append(r0)
            r6.append(r1)
            r6.append(r4)
            java.lang.String r6 = r6.toString()
            com.huawei.hms.hatool.j1.l(r2, r6)
            r6 = 0
        L58:
            com.huawei.hms.hatool.t r0 = com.huawei.hms.hatool.t.a()
            java.lang.String r1 = r3.a
            r0.h(r1, r4, r5, r6)
            return
        L62:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "onStreamEvent() parameters check fail. Nothing will be recorded.TAG: "
            r5.append(r6)
            java.lang.String r6 = r3.a
            r5.append(r6)
            r5.append(r1)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            com.huawei.hms.hatool.j1.l(r2, r4)
            return
    }

    public void g(com.huawei.hms.hatool.c1 r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "HiAnalyticsInstanceImpl.setOperConf() is executed.TAG: "
            r0.append(r1)
            java.lang.String r1 = r2.a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "hmsSdk"
            com.huawei.hms.hatool.j1.h(r1, r0)
            if (r3 != 0) goto L26
            com.huawei.hms.hatool.k0 r3 = r2.b
            r0 = 0
            r3.e(r0)
            java.lang.String r3 = "HiAnalyticsInstanceImpl.setOperConf(): config for oper is null!"
            com.huawei.hms.hatool.j1.l(r1, r3)
            return
        L26:
            com.huawei.hms.hatool.k0 r0 = r2.b
            r0.e(r3)
            return
    }
}
