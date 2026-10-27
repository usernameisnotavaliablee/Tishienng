package cn.jiguang.ad;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class j {
    private java.util.Map<java.lang.Long, java.lang.String> a;

    /* renamed from: cn.jiguang.ad.j$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    private static final class a {
        private static final cn.jiguang.ad.j a = null;

        static {
                cn.jiguang.ad.j r0 = new cn.jiguang.ad.j
                r1 = 0
                r0.<init>(r1)
                cn.jiguang.ad.j.a.a = r0
                return
        }

        public a() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ cn.jiguang.ad.j a() {
                cn.jiguang.ad.j r0 = cn.jiguang.ad.j.a.a
                return r0
        }
    }

    private j() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.a = r0
            return
    }

    /* synthetic */ j(cn.jiguang.ad.j.AnonymousClass1 r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public static cn.jiguang.ad.j a() {
            cn.jiguang.ad.j r0 = cn.jiguang.ad.j.a.a()
            return r0
    }

    private java.lang.String a(android.content.Context r2, java.lang.String r3, java.lang.String r4) {
            r1 = this;
            cn.jiguang.e.a r0 = cn.jiguang.e.a.a(r3)
            java.lang.Object r2 = cn.jiguang.e.b.a(r2, r0)
            java.lang.String r2 = (java.lang.String) r2
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L17
            boolean r2 = r4.equals(r2)
            if (r2 != 0) goto L17
            return r4
        L17:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "need not "
            r2.append(r0)
            r2.append(r3)
            java.lang.String r3 = " userctrl,newest version:"
            r2.append(r3)
            boolean r3 = android.text.TextUtils.isEmpty(r4)
            if (r3 == 0) goto L31
            java.lang.String r4 = "null"
        L31:
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "UserCtrlHelper"
            cn.jiguang.w.f.a(r3, r2)
            java.lang.String r2 = ""
            return r2
    }

    private void a(android.content.Context r11, short r12, java.lang.String r13, java.lang.String r14) {
            r10 = this;
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "sendUserCtrlInfo sdkType:"
            r2.append(r3)
            r2.append(r14)
            java.lang.String r3 = ",property:"
            r2.append(r3)
            r2.append(r12)
            java.lang.String r3 = ",verInfo:"
            r2.append(r3)
            r2.append(r13)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "UserCtrlHelper"
            cn.jiguang.w.f.c(r3, r2)
            long r2 = cn.jiguang.ad.i.b()
            r4 = 1
            byte[] r6 = cn.jiguang.af.b.a(r12, r4, r13)
            cn.jiguang.ad.i r0 = cn.jiguang.ad.i.a()
            r5 = 0
            r8 = 10000(0x2710, double:4.9407E-320)
            r4 = 26
            r1 = r11
            r7 = r14
            r0.a(r1, r2, r4, r5, r6, r7, r8)
            java.util.Map<java.lang.Long, java.lang.String> r1 = r10.a
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r1.put(r2, r14)
            return
    }

    public void a(android.content.Context r6) {
            r5 = this;
            if (r6 != 0) goto La
            java.lang.String r6 = "UserCtrlHelper"
            java.lang.String r0 = "handleUserCtrl failed,context is null"
            cn.jiguang.w.f.i(r6, r0)
            return
        La:
            java.util.HashMap<java.lang.String, cn.jiguang.api.JDispatchAction> r0 = cn.jiguang.ad.b.a
            if (r0 == 0) goto L5e
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L5e
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L1c:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L5e
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getValue()
            cn.jiguang.api.JDispatchAction r2 = (cn.jiguang.api.JDispatchAction) r2
            if (r2 == 0) goto L1c
            java.lang.Object r3 = r1.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r1.getKey()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r4 = r2.getSdkVersion(r4)
            java.lang.String r3 = r5.a(r6, r3, r4)
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 != 0) goto L1c
            java.lang.Object r4 = r1.getKey()
            java.lang.String r4 = (java.lang.String) r4
            short r2 = r2.getUserCtrlProperty(r4)
            java.lang.Object r1 = r1.getKey()
            java.lang.String r1 = (java.lang.String) r1
            r5.a(r6, r2, r3, r1)
            goto L1c
        L5e:
            return
    }

    public void a(android.content.Context r5, long r6) {
            r4 = this;
            java.util.Map<java.lang.Long, java.lang.String> r0 = r4.a
            java.lang.Long r1 = java.lang.Long.valueOf(r6)
            java.lang.Object r0 = r0.remove(r1)
            java.lang.String r0 = (java.lang.String) r0
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r2 = "UserCtrlHelper"
            if (r1 != 0) goto L66
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "userCtrlSuccess rid:"
            r1.append(r3)
            r1.append(r6)
            java.lang.String r6 = ",sdkType:"
            r1.append(r6)
            r1.append(r0)
            java.lang.String r6 = r1.toString()
            cn.jiguang.w.f.c(r2, r6)
            cn.jiguang.ad.b r6 = cn.jiguang.ad.b.a()
            java.lang.String r7 = ""
            java.lang.String r6 = r6.b(r0, r7)
            boolean r7 = android.text.TextUtils.isEmpty(r6)
            if (r7 != 0) goto L53
            cn.jiguang.e.a r7 = cn.jiguang.e.a.a(r0)
            cn.jiguang.e.a r6 = r7.a(r6)
            r7 = 1
            cn.jiguang.e.a[] r7 = new cn.jiguang.e.a[r7]
            r0 = 0
            r7[r0] = r6
            cn.jiguang.e.b.a(r5, r7)
            goto L7b
        L53:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "userCtrlSuccess but not found sdkversion by sdkType:"
            r6.append(r7)
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            goto L78
        L66:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "userCtrlSuccess but not found rid:"
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
        L78:
            cn.jiguang.w.f.c(r2, r6)
        L7b:
            java.util.Map<java.lang.Long, java.lang.String> r6 = r4.a
            if (r6 == 0) goto L99
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L99
            cn.jiguang.v.c r6 = cn.jiguang.v.c.a()
            boolean r6 = r6.a(r5)
            if (r6 != 0) goto L99
            cn.jiguang.ad.g r6 = cn.jiguang.ad.g.a()
            java.lang.String r7 = "tcp_a21"
            r0 = 0
            r6.a(r5, r7, r0)
        L99:
            return
    }

    public void a(android.content.Context r4, long r5, int r7) {
            r3 = this;
            java.util.Map<java.lang.Long, java.lang.String> r4 = r3.a
            java.lang.Long r0 = java.lang.Long.valueOf(r5)
            java.lang.Object r4 = r4.remove(r0)
            java.lang.String r4 = (java.lang.String) r4
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            java.lang.String r1 = "UserCtrlHelper"
            if (r0 != 0) goto L5d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "onUserCtrlFailed rid:"
            r0.append(r2)
            r0.append(r5)
            java.lang.String r5 = ",sdkType:"
            r0.append(r5)
            r0.append(r4)
            java.lang.String r5 = ",errorCode:"
            r0.append(r5)
            r0.append(r7)
            java.lang.String r5 = r0.toString()
            cn.jiguang.w.f.c(r1, r5)
            cn.jiguang.ad.b r5 = cn.jiguang.ad.b.a()
            java.lang.String r6 = ""
            java.lang.String r5 = r5.b(r4, r6)
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 == 0) goto L5c
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "onUserCtrlFailed but not found sdkversion by sdkType:"
            r5.append(r6)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
        L59:
            cn.jiguang.w.f.c(r1, r4)
        L5c:
            return
        L5d:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r7 = "onUserCtrlFailed but not found rid:"
            r4.append(r7)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            goto L59
    }

    public void b(android.content.Context r2, long r3) {
            r1 = this;
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "onUserCtrlTimeout rid:"
            r2.append(r0)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r0 = "UserCtrlHelper"
            cn.jiguang.w.f.c(r0, r2)
            java.util.Map<java.lang.Long, java.lang.String> r2 = r1.a
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r2.remove(r3)
            return
    }

    public boolean b(android.content.Context r6) {
            r5 = this;
            r0 = 0
            if (r6 != 0) goto Lb
            java.lang.String r6 = "UserCtrlHelper"
            java.lang.String r1 = "get isNeedUserCtrl failed,context is null"
            cn.jiguang.w.f.j(r6, r1)
            return r0
        Lb:
            java.util.HashMap<java.lang.String, cn.jiguang.api.JDispatchAction> r1 = cn.jiguang.ad.b.a
            if (r1 == 0) goto L4d
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L4d
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L1d:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L4d
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getValue()
            cn.jiguang.api.JDispatchAction r3 = (cn.jiguang.api.JDispatchAction) r3
            if (r3 == 0) goto L1d
            java.lang.Object r4 = r2.getKey()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r2 = r2.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r2 = r3.getSdkVersion(r2)
            java.lang.String r2 = r5.a(r6, r4, r2)
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L1d
            r6 = 1
            return r6
        L4d:
            return r0
    }
}
