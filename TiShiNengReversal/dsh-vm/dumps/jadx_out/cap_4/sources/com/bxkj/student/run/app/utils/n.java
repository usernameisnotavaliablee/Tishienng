package com.bxkj.student.run.app.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class n {

    @org.jetbrains.annotations.NotNull
    public static final com.bxkj.student.run.app.utils.n.a a = null;

    @org.jetbrains.annotations.NotNull
    private static java.util.Map<java.lang.String, java.lang.String> b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a {

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: com.bxkj.student.run.app.utils.n$a$a, reason: collision with other inner class name */
        public static final class C0137a {

            @org.jetbrains.annotations.NotNull
            public static final com.bxkj.student.run.app.utils.n.a.C0137a a = null;

            static {
                    com.bxkj.student.run.app.utils.n$a$a r0 = new com.bxkj.student.run.app.utils.n$a$a
                    r0.<init>()
                    com.bxkj.student.run.app.utils.n.a.C0137a.a = r0
                    return
            }

            private C0137a() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            public final boolean a(@org.jetbrains.annotations.NotNull android.content.Context r2) {
                    r1 = this;
                    java.lang.String r0 = "context"
                    kotlin.jvm.internal.g0.p(r2, r0)
                    java.lang.String r0 = "location"
                    java.lang.Object r2 = r2.getSystemService(r0)
                    java.lang.String r0 = "null cannot be cast to non-null type android.location.LocationManager"
                    kotlin.jvm.internal.g0.n(r2, r0)
                    android.location.LocationManager r2 = (android.location.LocationManager) r2
                    java.lang.String r0 = "gps"
                    boolean r2 = r2.isProviderEnabled(r0)     // Catch: java.lang.Exception -> L19
                    return r2
                L19:
                    r2 = 0
                    return r2
            }
        }

        private a() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ a(kotlin.jvm.internal.v r1) {
                r0 = this;
                r0.<init>()
                return
        }

        private final java.util.Map<java.lang.String, java.lang.String> b() {
                r1 = this;
                java.util.Map r0 = r1.a()
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final java.util.Map<java.lang.String, java.lang.String> a() {
                r1 = this;
                java.util.Map r0 = com.bxkj.student.run.app.utils.n.a()
                return r0
        }

        public final boolean c(@org.jetbrains.annotations.NotNull android.content.Context r11) {
                r10 = this;
                java.lang.String r0 = "context"
                kotlin.jvm.internal.g0.p(r11, r0)
                java.util.Map r0 = r10.b()
                android.content.pm.PackageManager r11 = r11.getPackageManager()
                r1 = 0
                java.util.List r2 = r11.getInstalledPackages(r1)
                java.lang.String r3 = "getInstalledPackages(...)"
                kotlin.jvm.internal.g0.o(r2, r3)
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r4 = r2
                java.util.Collection r4 = (java.util.Collection) r4
                int r4 = r4.size()
                r5 = 0
            L24:
                if (r5 >= r4) goto L94
                java.lang.Object r6 = r2.get(r5)
                android.content.pm.PackageInfo r6 = (android.content.pm.PackageInfo) r6
                android.content.pm.ApplicationInfo r6 = r6.applicationInfo
                java.lang.CharSequence r6 = r11.getApplicationLabel(r6)
                java.lang.String r6 = r6.toString()
                java.lang.Object r7 = r2.get(r5)
                android.content.pm.PackageInfo r7 = (android.content.pm.PackageInfo) r7
                java.lang.String r7 = r7.packageName
                java.lang.String r8 = "packageName"
                kotlin.jvm.internal.g0.o(r7, r8)
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r9 = "appName: "
                r8.append(r9)
                r8.append(r6)
                java.lang.String r6 = " packageName: "
                r8.append(r6)
                r8.append(r7)
                java.lang.String r6 = r8.toString()
                r3.append(r6)
                java.lang.String r6 = "\n"
                r3.append(r6)
                java.lang.Object r6 = r2.get(r5)
                android.content.pm.PackageInfo r6 = (android.content.pm.PackageInfo) r6
                java.lang.String r6 = r6.packageName
                java.lang.Object r6 = r0.get(r6)
                if (r6 == 0) goto L91
                java.lang.Object r11 = r2.get(r5)
                android.content.pm.PackageInfo r11 = (android.content.pm.PackageInfo) r11
                java.lang.String r11 = r11.packageName
                java.lang.Object r11 = r0.get(r11)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r11)
                java.lang.String r11 = r0.toString()
                java.lang.Object[] r0 = new java.lang.Object[r1]
                com.orhanobut.logger.j.d(r11, r0)
                r11 = 1
                return r11
            L91:
                int r5 = r5 + 1
                goto L24
            L94:
                com.orhanobut.logger.j.c(r3)
                return r1
        }

        public final boolean d(@org.jetbrains.annotations.NotNull android.location.Location r2, @org.jetbrains.annotations.NotNull android.content.Context r3) {
                r1 = this;
                java.lang.String r0 = "location"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r0 = "context"
                kotlin.jvm.internal.g0.p(r3, r0)
                boolean r2 = r2.isFromMockProvider()
                return r2
        }

        public final void e(@org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> r2) {
                r1 = this;
                java.lang.String r0 = "<set-?>"
                kotlin.jvm.internal.g0.p(r2, r0)
                com.bxkj.student.run.app.utils.n.b(r2)
                return
        }
    }

    static {
            com.bxkj.student.run.app.utils.n$a r0 = new com.bxkj.student.run.app.utils.n$a
            r1 = 0
            r0.<init>(r1)
            com.bxkj.student.run.app.utils.n.a = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.lang.String r1 = "com.lerist.fakelocation"
            r0.put(r1, r1)
            java.lang.String r1 = "top.a1024bytes.mockloc.ca.pro"
            r0.put(r1, r1)
            java.lang.String r1 = "com.qgwapp.shadowside"
            r0.put(r1, r1)
            java.lang.String r1 = "net.superal"
            r0.put(r1, r1)
            java.lang.String r1 = "com.deniu.daniu"
            r0.put(r1, r1)
            java.lang.String r1 = "com.deniu.multi"
            r0.put(r1, r1)
            java.lang.String r1 = "com.txy.anywhere"
            r0.put(r1, r1)
            java.lang.String r1 = "de.robv.android.xposed.installer"
            r0.put(r1, r1)
            java.lang.String r1 = "github.tornaco.xposedmoduletest"
            r0.put(r1, r1)
            com.bxkj.student.run.app.utils.n.b = r0
            return
    }

    public n() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final /* synthetic */ java.util.Map a() {
            java.util.Map<java.lang.String, java.lang.String> r0 = com.bxkj.student.run.app.utils.n.b
            return r0
    }

    public static final /* synthetic */ void b(java.util.Map r0) {
            com.bxkj.student.run.app.utils.n.b = r0
            return
    }
}
