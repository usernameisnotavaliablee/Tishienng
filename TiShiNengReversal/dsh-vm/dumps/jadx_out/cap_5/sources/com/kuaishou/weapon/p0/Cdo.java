package com.kuaishou.weapon.p0;

@android.annotation.SuppressLint({"LongLogTag"})
/* renamed from: com.kuaishou.weapon.p0.do, reason: invalid class name */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class Cdo {

    /* renamed from: com.kuaishou.weapon.p0.do$a */
    static final class a {
        private a() {
                r0 = this;
                r0.<init>()
                return
        }

        static /* synthetic */ void a(java.lang.ClassLoader r0, java.io.File r1) {
                b(r0, r1)
                return
        }

        private static void b(java.lang.ClassLoader r8, java.io.File r9) {
                java.lang.String r0 = "pathList"
                java.lang.reflect.Field r0 = com.kuaishou.weapon.p0.dq.a(r8, r0)
                java.lang.Object r8 = r0.get(r8)
                java.lang.String r0 = "nativeLibraryDirectories"
                java.lang.reflect.Field r0 = com.kuaishou.weapon.p0.dq.a(r8, r0)
                java.lang.Object r1 = r0.get(r8)
                java.io.File[] r1 = (java.io.File[]) r1
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                int r3 = r1.length
                r4 = 0
                r5 = 0
            L1e:
                if (r5 >= r3) goto L2e
                r6 = r1[r5]
                boolean r7 = r9.equals(r6)
                if (r7 != 0) goto L2b
                r2.add(r6)
            L2b:
                int r5 = r5 + 1
                goto L1e
            L2e:
                r2.add(r9)
                java.io.File[] r9 = new java.io.File[r4]
                java.lang.Object[] r9 = r2.toArray(r9)
                r0.set(r8, r9)
                return
        }
    }

    /* renamed from: com.kuaishou.weapon.p0.do$b */
    static final class b {
        private b() {
                r0 = this;
                r0.<init>()
                return
        }

        static /* synthetic */ void a(java.lang.ClassLoader r0, java.io.File r1) {
                b(r0, r1)
                return
        }

        private static void b(java.lang.ClassLoader r7, java.io.File r8) {
                java.lang.String r0 = "pathList"
                java.lang.reflect.Field r0 = com.kuaishou.weapon.p0.dq.a(r7, r0)
                java.lang.Object r7 = r0.get(r7)
                java.lang.String r0 = "nativeLibraryDirectories"
                java.lang.reflect.Field r1 = com.kuaishou.weapon.p0.dq.a(r7, r0)
                java.lang.Object r2 = r1.get(r7)
                java.util.List r2 = (java.util.List) r2
                r3 = 2
                if (r2 != 0) goto L1e
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>(r3)
            L1e:
                java.util.ArrayList r4 = new java.util.ArrayList
                r4.<init>(r2)
                java.util.Iterator r2 = r4.iterator()
            L27:
                boolean r5 = r2.hasNext()
                if (r5 == 0) goto L3b
                java.lang.Object r5 = r2.next()
                java.io.File r5 = (java.io.File) r5
                boolean r5 = r8.equals(r5)
                if (r5 == 0) goto L27
                goto Lb5
            L3b:
                r4.add(r8)
                r1.set(r7, r4)
                java.lang.Object r8 = r1.get(r7)
                if (r8 == r4) goto L4e
                java.lang.reflect.Field r8 = com.kuaishou.weapon.p0.dq.b(r7, r0)
                r8.set(r7, r4)
            L4e:
                java.lang.String r8 = "systemNativeLibraryDirectories"
                java.lang.reflect.Field r8 = com.kuaishou.weapon.p0.dq.a(r7, r8)
                java.lang.Object r8 = r8.get(r7)
                java.util.List r8 = (java.util.List) r8
                if (r8 != 0) goto L61
                java.util.ArrayList r8 = new java.util.ArrayList
                r8.<init>(r3)
            L61:
                java.util.ArrayList r0 = new java.util.ArrayList
                int r1 = r4.size()
                int r2 = r8.size()
                int r1 = r1 + r2
                r2 = 1
                int r1 = r1 + r2
                r0.<init>(r1)
                r0.addAll(r4)
                r0.addAll(r8)
                r8 = 3
                java.lang.Class[] r1 = new java.lang.Class[r8]
                r4 = 0
                java.lang.Class<java.util.List> r5 = java.util.List.class
                r1[r4] = r5
                java.lang.Class<java.io.File> r6 = java.io.File.class
                r1[r2] = r6
                r1[r3] = r5
                java.lang.String r5 = "makePathElements"
                java.lang.reflect.Method r1 = com.kuaishou.weapon.p0.dq.a(r7, r5, r1)
                java.util.ArrayList r5 = new java.util.ArrayList
                r5.<init>()
                java.lang.Object[] r8 = new java.lang.Object[r8]
                r8[r4] = r0
                r0 = 0
                r8[r2] = r0
                r8[r3] = r5
                java.lang.Object r8 = r1.invoke(r7, r8)
                java.lang.Object[] r8 = (java.lang.Object[]) r8
                java.lang.String r0 = "nativeLibraryPathElements"
                java.lang.reflect.Field r1 = com.kuaishou.weapon.p0.dq.a(r7, r0)
                r1.set(r7, r8)
                java.lang.Object r1 = r1.get(r7)
                if (r1 == r8) goto Lb5
                java.lang.reflect.Field r0 = com.kuaishou.weapon.p0.dq.b(r7, r0)
                r0.set(r7, r8)
            Lb5:
                return
        }
    }

    /* renamed from: com.kuaishou.weapon.p0.do$c */
    static final class c {
        private c() {
                r0 = this;
                r0.<init>()
                return
        }

        static /* synthetic */ void a(java.lang.ClassLoader r0, java.io.File r1) {
                b(r0, r1)
                return
        }

        private static void b(java.lang.ClassLoader r7, java.io.File r8) {
                java.lang.String r0 = "pathList"
                java.lang.reflect.Field r0 = com.kuaishou.weapon.p0.dq.a(r7, r0)
                java.lang.Object r7 = r0.get(r7)
                java.lang.String r0 = "nativeLibraryDirectories"
                java.lang.reflect.Field r0 = com.kuaishou.weapon.p0.dq.a(r7, r0)
                java.lang.Object r0 = r0.get(r7)
                java.util.List r0 = (java.util.List) r0
                r1 = 2
                if (r0 != 0) goto L1e
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>(r1)
            L1e:
                java.util.Iterator r2 = r0.iterator()
            L22:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L35
                java.lang.Object r3 = r2.next()
                java.io.File r3 = (java.io.File) r3
                boolean r3 = r8.equals(r3)
                if (r3 == 0) goto L22
                return
            L35:
                r0.add(r8)
                java.lang.String r8 = "systemNativeLibraryDirectories"
                java.lang.reflect.Field r8 = com.kuaishou.weapon.p0.dq.a(r7, r8)
                java.lang.Object r8 = r8.get(r7)
                java.util.List r8 = (java.util.List) r8
                if (r8 != 0) goto L4b
                java.util.ArrayList r8 = new java.util.ArrayList
                r8.<init>(r1)
            L4b:
                java.util.ArrayList r2 = new java.util.ArrayList
                int r3 = r0.size()
                int r4 = r8.size()
                int r3 = r3 + r4
                r4 = 1
                int r3 = r3 + r4
                r2.<init>(r3)
                r2.addAll(r0)
                r2.addAll(r8)
                r8 = 3
                java.lang.Class[] r0 = new java.lang.Class[r8]
                r3 = 0
                java.lang.Class<java.util.List> r5 = java.util.List.class
                r0[r3] = r5
                java.lang.Class<java.io.File> r6 = java.io.File.class
                r0[r4] = r6
                r0[r1] = r5
                java.lang.String r5 = "makePathElements"
                java.lang.reflect.Method r0 = com.kuaishou.weapon.p0.dq.a(r7, r5, r0)
                java.util.ArrayList r5 = new java.util.ArrayList
                r5.<init>()
                java.lang.Object[] r8 = new java.lang.Object[r8]
                r8[r3] = r2
                r2 = 0
                r8[r4] = r2
                r8[r1] = r5
                java.lang.Object r8 = r0.invoke(r7, r8)
                java.lang.Object[] r8 = (java.lang.Object[]) r8
                java.lang.String r0 = "nativeLibraryPathElements"
                java.lang.reflect.Field r0 = com.kuaishou.weapon.p0.dq.a(r7, r0)
                r0.set(r7, r8)
                return
        }
    }

    /* renamed from: com.kuaishou.weapon.p0.do$d */
    static final class d {
        private d() {
                r0 = this;
                r0.<init>()
                return
        }

        static /* synthetic */ void a(java.lang.ClassLoader r0, java.io.File r1) {
                b(r0, r1)
                return
        }

        private static void b(java.lang.ClassLoader r4, java.io.File r5) {
                java.lang.String r0 = "pathList"
                java.lang.reflect.Field r0 = com.kuaishou.weapon.p0.dq.a(r4, r0)
                java.lang.Object r4 = r0.get(r4)
                java.lang.String r0 = "nativeLibraryDirectories"
                java.lang.reflect.Field r0 = com.kuaishou.weapon.p0.dq.a(r4, r0)
                java.lang.Object r0 = r0.get(r4)
                java.util.List r0 = (java.util.List) r0
                r1 = 2
                if (r0 != 0) goto L1e
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>(r1)
            L1e:
                java.util.Iterator r2 = r0.iterator()
            L22:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L35
                java.lang.Object r3 = r2.next()
                java.io.File r3 = (java.io.File) r3
                boolean r3 = r5.equals(r3)
                if (r3 == 0) goto L22
                return
            L35:
                r0.add(r5)
                java.lang.String r5 = "systemNativeLibraryDirectories"
                java.lang.reflect.Field r5 = com.kuaishou.weapon.p0.dq.a(r4, r5)
                java.lang.Object r5 = r5.get(r4)
                java.util.List r5 = (java.util.List) r5
                if (r5 != 0) goto L4b
                java.util.ArrayList r5 = new java.util.ArrayList
                r5.<init>(r1)
            L4b:
                java.util.ArrayList r1 = new java.util.ArrayList
                int r2 = r0.size()
                int r3 = r5.size()
                int r2 = r2 + r3
                r3 = 1
                int r2 = r2 + r3
                r1.<init>(r2)
                r1.addAll(r0)
                r1.addAll(r5)
                java.lang.Class[] r5 = new java.lang.Class[r3]
                java.lang.Class<java.util.List> r0 = java.util.List.class
                r2 = 0
                r5[r2] = r0
                java.lang.String r0 = "makePathElements"
                java.lang.reflect.Method r5 = com.kuaishou.weapon.p0.dq.a(r4, r0, r5)
                java.lang.Object[] r0 = new java.lang.Object[r3]
                r0[r2] = r1
                java.lang.Object r5 = r5.invoke(r4, r0)
                java.lang.Object[] r5 = (java.lang.Object[]) r5
                java.lang.String r0 = "nativeLibraryPathElements"
                java.lang.reflect.Field r0 = com.kuaishou.weapon.p0.dq.a(r4, r0)
                r0.set(r4, r5)
                return
        }
    }

    /* renamed from: com.kuaishou.weapon.p0.do$e */
    static final class e {
        private e() {
                r0 = this;
                r0.<init>()
                return
        }

        static /* synthetic */ void a(java.lang.ClassLoader r0, java.io.File r1) {
                b(r0, r1)
                return
        }

        private static void b(java.lang.ClassLoader r4, java.io.File r5) {
                java.lang.String r5 = r5.getPath()
                java.lang.String r0 = "libPath"
                java.lang.reflect.Field r0 = com.kuaishou.weapon.p0.dq.a(r4, r0)
                java.lang.Object r1 = r0.get(r4)
                java.lang.String r1 = java.lang.String.valueOf(r1)
                boolean r2 = android.text.TextUtils.isEmpty(r1)
                if (r2 != 0) goto L2d
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r1)
                java.lang.String r1 = ":"
                r2.append(r1)
                r2.append(r5)
                java.lang.String r1 = r2.toString()
                goto L2e
            L2d:
                r1 = r5
            L2e:
                r0.set(r4, r1)
                java.lang.String r0 = "libraryPathElements"
                java.lang.reflect.Field r0 = com.kuaishou.weapon.p0.dq.a(r4, r0)
                java.lang.Object r1 = r0.get(r4)
                java.util.List r1 = (java.util.List) r1
                java.util.Iterator r2 = r1.iterator()
            L41:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L54
                java.lang.Object r3 = r2.next()
                java.lang.String r3 = (java.lang.String) r3
                boolean r3 = r5.equals(r3)
                if (r3 == 0) goto L41
                return
            L54:
                r1.add(r5)
                r0.set(r4, r1)
                return
        }
    }

    public Cdo() {
            r0 = this;
            r0.<init>()
            return
    }

    public static synchronized void a(java.lang.ClassLoader r4, java.io.File r5) {
            java.lang.Class<com.kuaishou.weapon.p0.do> r0 = com.kuaishou.weapon.p0.Cdo.class
            monitor-enter(r0)
            if (r5 == 0) goto L4d
            boolean r1 = r5.exists()     // Catch: java.lang.Throwable -> L19
            if (r1 != 0) goto Lc
            goto L4d
        Lc:
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L19
            r2 = 25
            if (r1 != r2) goto L1b
            int r3 = com.bytedance.pangle.transform.c.a()     // Catch: java.lang.Throwable -> L19
            if (r3 != 0) goto L1d
            goto L1b
        L19:
            r4 = move-exception
            goto L4b
        L1b:
            if (r1 <= r2) goto L27
        L1d:
            com.kuaishou.weapon.p0.Cdo.d.a(r4, r5)     // Catch: java.lang.Throwable -> L22
            monitor-exit(r0)
            return
        L22:
            com.kuaishou.weapon.p0.Cdo.b.a(r4, r5)     // Catch: java.lang.Throwable -> L19
            monitor-exit(r0)
            return
        L27:
            r2 = 24
            if (r1 != r2) goto L36
            com.kuaishou.weapon.p0.Cdo.c.a(r4, r5)     // Catch: java.lang.Throwable -> L30
            monitor-exit(r0)
            return
        L30:
            r1 = move-exception
            com.kuaishou.weapon.p0.Cdo.a.a(r4, r5)     // Catch: java.lang.Throwable -> L35
            goto L43
        L35:
            throw r1     // Catch: java.lang.Throwable -> L19
        L36:
            r2 = 23
            if (r1 < r2) goto L46
            com.kuaishou.weapon.p0.Cdo.b.a(r4, r5)     // Catch: java.lang.Throwable -> L3f
            monitor-exit(r0)
            return
        L3f:
            r1 = move-exception
            com.kuaishou.weapon.p0.Cdo.a.a(r4, r5)     // Catch: java.lang.Throwable -> L45
        L43:
            monitor-exit(r0)
            return
        L45:
            throw r1     // Catch: java.lang.Throwable -> L19
        L46:
            com.kuaishou.weapon.p0.Cdo.a.a(r4, r5)     // Catch: java.lang.Throwable -> L19
            monitor-exit(r0)
            return
        L4b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            throw r4
        L4d:
            monitor-exit(r0)
            return
    }
}
