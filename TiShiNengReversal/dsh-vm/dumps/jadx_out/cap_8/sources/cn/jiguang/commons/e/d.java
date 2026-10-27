package cn.jiguang.commons.E;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class d extends cn.jiguang.commons.E.c {

    static /* synthetic */ class a {
        public a() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    private static final class b {
        private static final cn.jiguang.commons.E.d a = null;

        static {
                cn.jiguang.commons.E.d r0 = new cn.jiguang.commons.E.d
                r1 = 0
                r0.<init>(r1)
                cn.jiguang.commons.E.d.b.a = r0
                return
        }

        public b() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ cn.jiguang.commons.E.d a() {
                cn.jiguang.commons.E.d r0 = cn.jiguang.commons.E.d.b.a
                return r0
        }
    }

    private d() {
            r0 = this;
            r0.<init>()
            return
    }

    /* synthetic */ d(cn.jiguang.commons.E.d.a r1) {
            r0 = this;
            r0.<init>()
            return
    }

    private cn.jiguang.commons.c.d a(java.lang.String r12, java.lang.String r13) {
            r11 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            r2 = 0
            if (r0 >= r1) goto L8
            return r2
        L8:
            java.lang.String r0 = "java.nio.file.Paths"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> La6
            java.lang.String r1 = "java.nio.file.Files"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> La6
            java.lang.String r3 = "java.nio.file.Path"
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.Throwable -> La6
            java.lang.String r4 = "java.nio.file.attribute.BasicFileAttributes"
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch: java.lang.Throwable -> La6
            java.lang.String r5 = "get"
            r6 = 2
            java.lang.Class[] r7 = new java.lang.Class[r6]     // Catch: java.lang.Throwable -> La6
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r9 = 0
            r7[r9] = r8     // Catch: java.lang.Throwable -> La6
            java.lang.Class<java.lang.String[]> r8 = java.lang.String[].class
            r10 = 1
            r7[r10] = r8     // Catch: java.lang.Throwable -> La6
            java.lang.reflect.Method r0 = r0.getMethod(r5, r7)     // Catch: java.lang.Throwable -> La6
            java.lang.String[] r5 = new java.lang.String[r9]     // Catch: java.lang.Throwable -> La6
            java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> La6
            r7[r9] = r13     // Catch: java.lang.Throwable -> La6
            r7[r10] = r5     // Catch: java.lang.Throwable -> La6
            java.lang.Object r13 = r0.invoke(r2, r7)     // Catch: java.lang.Throwable -> La6
            java.lang.String r0 = "readAttributes"
            java.lang.String r5 = "[Ljava.nio.file.LinkOption;"
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch: java.lang.Throwable -> La6
            r7 = 3
            java.lang.Class[] r8 = new java.lang.Class[r7]     // Catch: java.lang.Throwable -> La6
            r8[r9] = r3     // Catch: java.lang.Throwable -> La6
            java.lang.Class<java.lang.Class> r3 = java.lang.Class.class
            r8[r10] = r3     // Catch: java.lang.Throwable -> La6
            r8[r6] = r5     // Catch: java.lang.Throwable -> La6
            java.lang.reflect.Method r0 = r1.getMethod(r0, r8)     // Catch: java.lang.Throwable -> La6
            java.lang.String r1 = "java.nio.file.LinkOption"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> La6
            java.lang.Object r1 = java.lang.reflect.Array.newInstance(r1, r9)     // Catch: java.lang.Throwable -> La6
            java.lang.Object[] r3 = new java.lang.Object[r7]     // Catch: java.lang.Throwable -> La6
            r3[r9] = r13     // Catch: java.lang.Throwable -> La6
            r3[r10] = r4     // Catch: java.lang.Throwable -> La6
            r3[r6] = r1     // Catch: java.lang.Throwable -> La6
            java.lang.Object r13 = r0.invoke(r2, r3)     // Catch: java.lang.Throwable -> La6
            java.lang.String r0 = "lastModifiedTime"
            java.lang.reflect.Method r0 = r4.getMethod(r0, r2)     // Catch: java.lang.Throwable -> La6
            java.lang.Object r13 = r0.invoke(r13, r2)     // Catch: java.lang.Throwable -> La6
            if (r13 != 0) goto L79
            return r2
        L79:
            java.lang.String r0 = "java.nio.file.attribute.FileTime"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> La6
            java.lang.String r1 = "toMillis"
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)     // Catch: java.lang.Throwable -> La6
            java.lang.Object r13 = r0.invoke(r13, r2)     // Catch: java.lang.Throwable -> La6
            java.lang.Long r13 = (java.lang.Long) r13     // Catch: java.lang.Throwable -> La6
            r13.getClass()     // Catch: java.lang.Throwable -> La6
            cn.jiguang.commons.c.d r0 = new cn.jiguang.commons.c.d     // Catch: java.lang.Throwable -> La6
            r0.<init>()     // Catch: java.lang.Throwable -> La6
            r0.a = r12     // Catch: java.lang.Throwable -> La6
            java.util.List r12 = r0.f1004f     // Catch: java.lang.Throwable -> La6
            r12.add(r13)     // Catch: java.lang.Throwable -> La6
            java.util.List r12 = r0.f1003e     // Catch: java.lang.Throwable -> La6
            r13 = 8
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch: java.lang.Throwable -> La6
            r12.add(r13)     // Catch: java.lang.Throwable -> La6
            return r0
        La6:
            return r2
    }

    private void a(java.util.HashMap r5) {
            r4 = this;
            java.lang.String r0 = "JAppActiveFile"
            java.lang.String r1 = cn.jiguang.commons.f.d.g()     // Catch: java.lang.Throwable -> L57
            java.util.HashMap r1 = cn.jiguang.commons.f.d.e(r1)     // Catch: java.lang.Throwable -> L57
            if (r1 == 0) goto L72
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Throwable -> L57
            if (r2 != 0) goto L72
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L57
            r2.<init>()     // Catch: java.lang.Throwable -> L57
            java.lang.String r3 = "collect from folder cfg, size:"
            r2.append(r3)     // Catch: java.lang.Throwable -> L57
            int r3 = r1.size()     // Catch: java.lang.Throwable -> L57
            r2.append(r3)     // Catch: java.lang.Throwable -> L57
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L57
            cn.jiguang.commons.w.a.a(r0, r2)     // Catch: java.lang.Throwable -> L57
            int r2 = r5.size()     // Catch: java.lang.Throwable -> L57
            r4.a(r1, r5)     // Catch: java.lang.Throwable -> L57
            int r1 = r5.size()     // Catch: java.lang.Throwable -> L57
            int r1 = r1 - r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L57
            r2.<init>()     // Catch: java.lang.Throwable -> L57
            java.lang.String r3 = "folder result - collected:"
            r2.append(r3)     // Catch: java.lang.Throwable -> L57
            r2.append(r1)     // Catch: java.lang.Throwable -> L57
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L57
            cn.jiguang.commons.w.a.a(r0, r2)     // Catch: java.lang.Throwable -> L57
            if (r1 <= 0) goto L59
            cn.jiguang.commons.A.a r5 = cn.jiguang.commons.A.a.f()     // Catch: java.lang.Throwable -> L57
            r1 = 3047(0xbe7, float:4.27E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L57
            goto L6e
        L57:
            r5 = move-exception
            goto L78
        L59:
            boolean r5 = r5.isEmpty()     // Catch: java.lang.Throwable -> L57
            if (r5 == 0) goto L71
            java.lang.String r5 = "all sources failed"
            cn.jiguang.commons.w.a.a(r0, r5)     // Catch: java.lang.Throwable -> L57
            cn.jiguang.commons.A.a r5 = cn.jiguang.commons.A.a.f()     // Catch: java.lang.Throwable -> L57
            r1 = 3050(0xbea, float:4.274E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L57
        L6e:
            r5.c(r1)     // Catch: java.lang.Throwable -> L57
        L71:
            return
        L72:
            java.lang.String r5 = "folder cfg empty"
            cn.jiguang.commons.w.a.a(r0, r5)     // Catch: java.lang.Throwable -> L57
            return
        L78:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "folder err:"
            r1.append(r2)
            java.lang.String r5 = r5.getMessage()
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            cn.jiguang.commons.w.a.f(r0, r5)
            return
    }

    private void a(java.util.HashMap r3, java.util.HashMap r4) {
            r2 = this;
            if (r3 == 0) goto L2e
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L9
            goto L2e
        L9:
            java.util.Set r3 = r3.keySet()
            java.util.Iterator r3 = r3.iterator()
        L11:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L2e
            java.lang.Object r0 = r3.next()
            java.lang.String r0 = (java.lang.String) r0
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L24
            goto L11
        L24:
            cn.jiguang.commons.c.d r1 = r2.f(r0)
            if (r1 == 0) goto L11
            r4.put(r0, r1)
            goto L11
        L2e:
            return
    }

    private void a(java.util.List r5, java.util.HashMap r6) {
            r4 = this;
            if (r5 == 0) goto L6a
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L9
            goto L6a
        L9:
            int r0 = r5.size()
            java.util.Iterator r5 = r5.iterator()
            r1 = 0
        L12:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L39
            java.lang.Object r2 = r5.next()
            cn.jiguang.commons.c.e r2 = (cn.jiguang.commons.c.e) r2
            if (r2 == 0) goto L12
            java.lang.String r3 = r2.f1007c
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L29
            goto L12
        L29:
            java.lang.String r3 = r2.f1007c
            cn.jiguang.commons.c.d r3 = r4.f(r3)
            if (r3 == 0) goto L12
            java.lang.String r2 = r2.f1007c
            r6.put(r2, r3)
            int r1 = r1 + 1
            goto L12
        L39:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "app list result - total:"
            r5.append(r6)
            r5.append(r0)
            java.lang.String r6 = ", success:"
            r5.append(r6)
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "JAppActiveFile"
            cn.jiguang.commons.w.a.a(r6, r5)
            cn.jiguang.commons.A.a r5 = cn.jiguang.commons.A.a.f()
            if (r1 <= 0) goto L67
            r6 = 3048(0xbe8, float:4.271E-42)
        L5f:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r5.c(r6)
            return
        L67:
            r6 = 3049(0xbe9, float:4.273E-42)
            goto L5f
        L6a:
            return
    }

    private void a(boolean r1, java.util.HashMap r2) {
            r0 = this;
            boolean r1 = r0.c(r1, r2)
            if (r1 == 0) goto L7
            return
        L7:
            r0.a(r2)
            return
    }

    private java.util.List c() {
            r3 = this;
            cn.jiguang.commons.g.n r0 = cn.jiguang.commons.g.n.a()     // Catch: java.lang.Throwable -> Lc
            r1 = 1100(0x44c, float:1.541E-42)
            r2 = 0
            java.util.List r0 = r0.c(r1, r2)     // Catch: java.lang.Throwable -> Lc
            return r0
        Lc:
            r0 = 0
            return r0
    }

    private java.util.List c(boolean r5) {
            r4 = this;
            java.lang.String r0 = "JAppActiveFile"
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.util.List r2 = r4.c()     // Catch: java.lang.Throwable -> L2d
            boolean r3 = r4.e(r2)     // Catch: java.lang.Throwable -> L2d
            if (r3 == 0) goto L2f
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2d
            r5.<init>()     // Catch: java.lang.Throwable -> L2d
            java.lang.String r3 = "collect from app list, size:"
            r5.append(r3)     // Catch: java.lang.Throwable -> L2d
            int r3 = r2.size()     // Catch: java.lang.Throwable -> L2d
            r5.append(r3)     // Catch: java.lang.Throwable -> L2d
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L2d
            cn.jiguang.commons.w.a.a(r0, r5)     // Catch: java.lang.Throwable -> L2d
            r4.a(r2, r1)     // Catch: java.lang.Throwable -> L2d
            goto L50
        L2d:
            r5 = move-exception
            goto L38
        L2f:
            java.lang.String r2 = "app list failed, try alternatives"
            cn.jiguang.commons.w.a.a(r0, r2)     // Catch: java.lang.Throwable -> L2d
            r4.a(r5, r1)     // Catch: java.lang.Throwable -> L2d
            goto L50
        L38:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "collect err:"
            r2.append(r3)
            java.lang.String r5 = r5.getMessage()
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            cn.jiguang.commons.w.a.f(r0, r5)
        L50:
            java.util.ArrayList r5 = new java.util.ArrayList
            java.util.Collection r0 = r1.values()
            r5.<init>(r0)
            return r5
    }

    private void c(java.util.List r3, java.util.HashMap r4) {
            r2 = this;
            if (r3 == 0) goto L28
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L9
            goto L28
        L9:
            java.util.Iterator r3 = r3.iterator()
        Ld:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L28
            java.lang.Object r0 = r3.next()
            cn.jiguang.commons.c.e r0 = (cn.jiguang.commons.c.e) r0
            if (r0 != 0) goto L1c
            goto Ld
        L1c:
            java.lang.String r0 = r0.f1007c
            cn.jiguang.commons.c.d r1 = r2.f(r0)
            if (r1 == 0) goto Ld
            r4.put(r0, r1)
            goto Ld
        L28:
            return
    }

    private boolean c(boolean r4, java.util.HashMap r5) {
            r3 = this;
            java.lang.String r0 = "JAppActiveFile"
            cn.jiguang.commons.g.n r1 = cn.jiguang.commons.g.n.a()     // Catch: java.lang.Throwable -> L5d
            r2 = 1110(0x456, float:1.555E-42)
            java.util.List r4 = r1.c(r2, r4)     // Catch: java.lang.Throwable -> L5d
            if (r4 == 0) goto L76
            boolean r1 = r4.isEmpty()     // Catch: java.lang.Throwable -> L5d
            if (r1 != 0) goto L76
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5d
            r1.<init>()     // Catch: java.lang.Throwable -> L5d
            java.lang.String r2 = "collect from pkg list, size:"
            r1.append(r2)     // Catch: java.lang.Throwable -> L5d
            int r2 = r4.size()     // Catch: java.lang.Throwable -> L5d
            r1.append(r2)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L5d
            cn.jiguang.commons.w.a.a(r0, r1)     // Catch: java.lang.Throwable -> L5d
            int r1 = r5.size()     // Catch: java.lang.Throwable -> L5d
            r3.c(r4, r5)     // Catch: java.lang.Throwable -> L5d
            int r4 = r5.size()     // Catch: java.lang.Throwable -> L5d
            int r4 = r4 - r1
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5d
            r5.<init>()     // Catch: java.lang.Throwable -> L5d
            java.lang.String r1 = "pkg list result - collected:"
            r5.append(r1)     // Catch: java.lang.Throwable -> L5d
            r5.append(r4)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L5d
            cn.jiguang.commons.w.a.a(r0, r5)     // Catch: java.lang.Throwable -> L5d
            if (r4 <= 0) goto L76
            cn.jiguang.commons.A.a r4 = cn.jiguang.commons.A.a.f()     // Catch: java.lang.Throwable -> L5d
            r5 = 3051(0xbeb, float:4.275E-42)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L5d
            r4.c(r5)     // Catch: java.lang.Throwable -> L5d
            r4 = 1
            return r4
        L5d:
            r4 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r1 = "pkg list err:"
            r5.append(r1)
            java.lang.String r4 = r4.getMessage()
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            cn.jiguang.commons.w.a.f(r0, r4)
        L76:
            cn.jiguang.commons.A.a r4 = cn.jiguang.commons.A.a.f()
            r5 = 3046(0xbe6, float:4.268E-42)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4.c(r5)
            java.lang.String r4 = "pkg list failed"
            cn.jiguang.commons.w.a.a(r0, r4)
            r4 = 0
            return r4
    }

    public static cn.jiguang.commons.E.d d() {
            cn.jiguang.commons.E.d r0 = cn.jiguang.commons.E.d.b.a()
            return r0
    }

    private boolean e(java.util.List r1) {
            r0 = this;
            if (r1 == 0) goto La
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto La
            r1 = 1
            return r1
        La:
            r1 = 0
            return r1
    }

    private cn.jiguang.commons.c.d f(java.lang.String r3) {
            r2 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L8
            r3 = 0
            return r3
        L8:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = cn.jiguang.commons.L.m.a()
            r0.append(r1)
            java.lang.String r1 = java.io.File.separator
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            cn.jiguang.commons.c.d r3 = r2.a(r3, r0)
            return r3
    }

    @Override // cn.jiguang.commons.a.c
    public java.lang.String a() {
            r1 = this;
            java.lang.String r0 = "JAppActiveFile"
            return r0
    }

    @Override // cn.jiguang.commons.a.c
    public void a(boolean r4) {
            r3 = this;
            java.lang.String r0 = "JAppActiveFile"
            java.util.List r4 = r3.c(r4)     // Catch: java.lang.Throwable -> L32
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L32
            r1.<init>()     // Catch: java.lang.Throwable -> L32
            java.lang.String r2 = "collected active info size:"
            r1.append(r2)     // Catch: java.lang.Throwable -> L32
            int r2 = r4.size()     // Catch: java.lang.Throwable -> L32
            r1.append(r2)     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L32
            cn.jiguang.commons.w.a.a(r0, r1)     // Catch: java.lang.Throwable -> L32
            boolean r1 = r4.isEmpty()     // Catch: java.lang.Throwable -> L32
            if (r1 != 0) goto L34
            r3.c(r4)     // Catch: java.lang.Throwable -> L32
            cn.jiguang.commons.A.a r4 = cn.jiguang.commons.A.a.f()     // Catch: java.lang.Throwable -> L32
            r1 = 3000(0xbb8, float:4.204E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L32
            goto L43
        L32:
            r4 = move-exception
            goto L47
        L34:
            java.lang.String r4 = "no active file data"
            cn.jiguang.commons.w.a.a(r0, r4)     // Catch: java.lang.Throwable -> L32
            cn.jiguang.commons.A.a r4 = cn.jiguang.commons.A.a.f()     // Catch: java.lang.Throwable -> L32
            r1 = 3001(0xbb9, float:4.205E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L32
        L43:
            r4.c(r1)     // Catch: java.lang.Throwable -> L32
            return
        L47:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "app active file err:"
            r1.append(r2)
            java.lang.String r4 = r4.getMessage()
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            cn.jiguang.commons.w.a.f(r0, r4)
            cn.jiguang.commons.A.a r4 = cn.jiguang.commons.A.a.f()
            r0 = 3002(0xbba, float:4.207E-42)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.c(r0)
            return
    }
}
