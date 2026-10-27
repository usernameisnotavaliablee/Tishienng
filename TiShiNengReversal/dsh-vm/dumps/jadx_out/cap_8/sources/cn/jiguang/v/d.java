package cn.jiguang.v;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class d {
    private static java.lang.String a;

    /* renamed from: b, reason: collision with root package name */
    private static java.lang.String f1494b;

    /* renamed from: cn.jiguang.v.d$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    private static final class a {
        private static final cn.jiguang.v.d a = null;

        static {
                cn.jiguang.v.d r0 = new cn.jiguang.v.d
                r1 = 0
                r0.<init>(r1)
                cn.jiguang.v.d.a.a = r0
                return
        }

        public a() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ cn.jiguang.v.d a() {
                cn.jiguang.v.d r0 = cn.jiguang.v.d.a.a
                return r0
        }
    }

    private d() {
            r0 = this;
            r0.<init>()
            return
    }

    /* synthetic */ d(cn.jiguang.v.d.AnonymousClass1 r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public static cn.jiguang.v.d a() {
            cn.jiguang.v.d r0 = cn.jiguang.v.d.a.a()
            return r0
    }

    public static java.lang.String a(android.content.Context r3) {
            java.lang.String r0 = cn.jiguang.v.d.f1494b
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.String r0 = c(r3)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r2 = "JCommonServiceHelper"
            if (r1 == 0) goto L31
            java.lang.String r3 = r3.getPackageName()
            cn.jiguang.v.d.f1494b = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "user serviceProcess is curProcessName:"
        L1f:
            r3.append(r0)
            java.lang.String r0 = cn.jiguang.v.d.f1494b
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            cn.jiguang.w.f.c(r2, r3)
            java.lang.String r3 = cn.jiguang.v.d.f1494b
            return r3
        L31:
            java.lang.String r3 = cn.jiguang.av.a.a(r3, r0)
            cn.jiguang.v.d.f1494b = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "user serviceProcess is:"
            goto L1f
    }

    public static boolean b(android.content.Context r1) {
            java.lang.String r0 = a(r1)
            java.lang.String r1 = cn.jiguang.av.a.a(r1)
            boolean r1 = r1.equals(r0)
            return r1
    }

    public static java.lang.String c(android.content.Context r7) {
            java.lang.String r0 = "found userServiceClass :"
            java.lang.Class<cn.jpush.android.service.JCommonService> r1 = cn.jpush.android.service.JCommonService.class
            java.lang.String r2 = ""
            java.lang.String r3 = "JCommonServiceHelper"
            java.lang.String r4 = cn.jiguang.v.d.a     // Catch: java.lang.Throwable -> L4e
            if (r4 == 0) goto Ld
            return r4
        Ld:
            android.content.Intent r4 = new android.content.Intent     // Catch: java.lang.Throwable -> L4e
            r4.<init>()     // Catch: java.lang.Throwable -> L4e
            java.lang.String r5 = "cn.jiguang.user.service.action"
            r4.setAction(r5)     // Catch: java.lang.Throwable -> L4e
            java.lang.String r5 = r7.getPackageName()     // Catch: java.lang.Throwable -> L4e
            r4.setPackage(r5)     // Catch: java.lang.Throwable -> L4e
            java.lang.String r4 = cn.jiguang.av.a.a(r7, r4, r2)     // Catch: java.lang.Throwable -> L4e
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L4e
            if (r5 != 0) goto L63
            java.lang.Class r5 = java.lang.Class.forName(r4)     // Catch: java.lang.Throwable -> L4e
            boolean r5 = r1.isAssignableFrom(r5)     // Catch: java.lang.Throwable -> L4e
            if (r5 == 0) goto L63
            cn.jiguang.v.d.a = r4     // Catch: java.lang.Throwable -> L4e
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4e
            r4.<init>()     // Catch: java.lang.Throwable -> L4e
            r4.append(r0)     // Catch: java.lang.Throwable -> L4e
            java.lang.String r5 = cn.jiguang.v.d.a     // Catch: java.lang.Throwable -> L4e
            r4.append(r5)     // Catch: java.lang.Throwable -> L4e
            java.lang.String r5 = " by getCommonServiceNames"
            r4.append(r5)     // Catch: java.lang.Throwable -> L4e
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L4e
            cn.jiguang.w.f.h(r3, r4)     // Catch: java.lang.Throwable -> L4e
            goto L63
        L4e:
            r4 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "getUserServiceClass failed:"
            r5.append(r6)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            cn.jiguang.w.f.c(r3, r4)
        L63:
            java.lang.String r4 = cn.jiguang.v.d.a
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L92
            java.lang.String r4 = r7.getPackageName()
            android.content.pm.ComponentInfo r7 = cn.jiguang.av.a.a(r7, r4, r1)
            if (r7 == 0) goto L92
            java.lang.String r7 = r7.name
            cn.jiguang.v.d.a = r7
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r0)
            java.lang.String r0 = cn.jiguang.v.d.a
            r7.append(r0)
            java.lang.String r0 = " by getComponentInfo"
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            cn.jiguang.w.f.h(r3, r7)
        L92:
            java.lang.String r7 = cn.jiguang.v.d.a
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 == 0) goto L9c
            cn.jiguang.v.d.a = r2
        L9c:
            java.lang.String r7 = cn.jiguang.v.d.a
            return r7
    }

    public void a(android.content.Context r4, java.lang.String r5, android.os.Bundle r6) {
            r3 = this;
            java.lang.String r0 = "JCommonServiceHelper"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L19
            r1.<init>()     // Catch: java.lang.Throwable -> L19
            java.lang.String r2 = "onAction action:"
            r1.append(r2)     // Catch: java.lang.Throwable -> L19
            r1.append(r5)     // Catch: java.lang.Throwable -> L19
            java.lang.String r2 = " bundle:"
            r1.append(r2)     // Catch: java.lang.Throwable -> L19
            if (r6 != 0) goto L1b
            java.lang.String r2 = "null"
            goto L1f
        L19:
            r4 = move-exception
            goto L3f
        L1b:
            java.lang.String r2 = r6.toString()     // Catch: java.lang.Throwable -> L19
        L1f:
            r1.append(r2)     // Catch: java.lang.Throwable -> L19
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L19
            cn.jiguang.w.f.c(r0, r1)     // Catch: java.lang.Throwable -> L19
            java.lang.String r1 = c(r4)     // Catch: java.lang.Throwable -> L19
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L19
            if (r2 == 0) goto L37
            cn.jiguang.a.a.b(r4, r5, r6)     // Catch: java.lang.Throwable -> L19
            return
        L37:
            cn.jiguang.v.e r2 = cn.jiguang.v.e.a()     // Catch: java.lang.Throwable -> L19
            r2.a(r4, r1, r5, r6)     // Catch: java.lang.Throwable -> L19
            return
        L3f:
            java.lang.String r5 = "onAction failed"
            cn.jiguang.w.f.f(r0, r5, r4)
            return
    }

    public void b(android.content.Context r4, java.lang.String r5, android.os.Bundle r6) {
            r3 = this;
            java.lang.String r0 = "JCommonServiceHelper"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L19
            r1.<init>()     // Catch: java.lang.Throwable -> L19
            java.lang.String r2 = "callAction action:"
            r1.append(r2)     // Catch: java.lang.Throwable -> L19
            r1.append(r5)     // Catch: java.lang.Throwable -> L19
            java.lang.String r2 = " bundle:"
            r1.append(r2)     // Catch: java.lang.Throwable -> L19
            if (r6 != 0) goto L1b
            java.lang.String r2 = "null"
            goto L1f
        L19:
            r4 = move-exception
            goto L31
        L1b:
            java.lang.String r2 = r6.toString()     // Catch: java.lang.Throwable -> L19
        L1f:
            r1.append(r2)     // Catch: java.lang.Throwable -> L19
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L19
            cn.jiguang.w.f.f(r0, r1)     // Catch: java.lang.Throwable -> L19
            android.content.Context r4 = cn.jiguang.av.c.a(r4)     // Catch: java.lang.Throwable -> L19
            cn.jiguang.z.a.a(r4, r5, r6)     // Catch: java.lang.Throwable -> L19
            return
        L31:
            java.lang.String r5 = "callAction failed"
            cn.jiguang.w.f.f(r0, r5, r4)
            return
    }
}
