package com.bxkj.student.common.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class Captcha {

    /* renamed from: n, reason: collision with root package name */
    private static final char[] f756n = null;

    /* renamed from: o, reason: collision with root package name */
    private static final char[] f757o = null;

    /* renamed from: p, reason: collision with root package name */
    private static final char[] f758p = null;

    /* renamed from: q, reason: collision with root package name */
    private static com.bxkj.student.common.utils.Captcha f759q;
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private com.bxkj.student.common.utils.Captcha.TYPE k;

    /* renamed from: l, reason: collision with root package name */
    private java.util.Random f760l;

    /* renamed from: m, reason: collision with root package name */
    private java.lang.String f761m;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum TYPE extends java.lang.Enum<com.bxkj.student.common.utils.Captcha.TYPE> {
        private static final /* synthetic */ com.bxkj.student.common.utils.Captcha.TYPE[] $VALUES = null;
        public static final com.bxkj.student.common.utils.Captcha.TYPE CHARS = null;
        public static final com.bxkj.student.common.utils.Captcha.TYPE LETTER = null;
        public static final com.bxkj.student.common.utils.Captcha.TYPE NUMBER = null;

        private static /* synthetic */ com.bxkj.student.common.utils.Captcha.TYPE[] $values() {
                r0 = 3
                com.bxkj.student.common.utils.Captcha$TYPE[] r0 = new com.bxkj.student.common.utils.Captcha.TYPE[r0]
                com.bxkj.student.common.utils.Captcha$TYPE r1 = com.bxkj.student.common.utils.Captcha.TYPE.NUMBER
                r2 = 0
                r0[r2] = r1
                com.bxkj.student.common.utils.Captcha$TYPE r1 = com.bxkj.student.common.utils.Captcha.TYPE.LETTER
                r2 = 1
                r0[r2] = r1
                com.bxkj.student.common.utils.Captcha$TYPE r1 = com.bxkj.student.common.utils.Captcha.TYPE.CHARS
                r2 = 2
                r0[r2] = r1
                return r0
        }

        static {
                com.bxkj.student.common.utils.Captcha$TYPE r0 = new com.bxkj.student.common.utils.Captcha$TYPE
                java.lang.String r1 = "NUMBER"
                r2 = 0
                r0.<init>(r1, r2)
                com.bxkj.student.common.utils.Captcha.TYPE.NUMBER = r0
                com.bxkj.student.common.utils.Captcha$TYPE r0 = new com.bxkj.student.common.utils.Captcha$TYPE
                java.lang.String r1 = "LETTER"
                r2 = 1
                r0.<init>(r1, r2)
                com.bxkj.student.common.utils.Captcha.TYPE.LETTER = r0
                com.bxkj.student.common.utils.Captcha$TYPE r0 = new com.bxkj.student.common.utils.Captcha$TYPE
                java.lang.String r1 = "CHARS"
                r2 = 2
                r0.<init>(r1, r2)
                com.bxkj.student.common.utils.Captcha.TYPE.CHARS = r0
                com.bxkj.student.common.utils.Captcha$TYPE[] r0 = $values()
                com.bxkj.student.common.utils.Captcha.TYPE.$VALUES = r0
                return
        }

        TYPE(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.bxkj.student.common.utils.Captcha.TYPE valueOf(java.lang.String r1) {
                java.lang.Class<com.bxkj.student.common.utils.Captcha$TYPE> r0 = com.bxkj.student.common.utils.Captcha.TYPE.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.bxkj.student.common.utils.Captcha$TYPE r1 = (com.bxkj.student.common.utils.Captcha.TYPE) r1
                return r1
        }

        public static com.bxkj.student.common.utils.Captcha.TYPE[] values() {
                com.bxkj.student.common.utils.Captcha$TYPE[] r0 = com.bxkj.student.common.utils.Captcha.TYPE.$VALUES
                java.lang.Object r0 = r0.clone()
                com.bxkj.student.common.utils.Captcha$TYPE[] r0 = (com.bxkj.student.common.utils.Captcha.TYPE[]) r0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a = null;

        static {
                com.bxkj.student.common.utils.Captcha$TYPE[] r0 = com.bxkj.student.common.utils.Captcha.TYPE.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.bxkj.student.common.utils.Captcha.a.a = r0
                com.bxkj.student.common.utils.Captcha$TYPE r1 = com.bxkj.student.common.utils.Captcha.TYPE.NUMBER     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.bxkj.student.common.utils.Captcha.a.a     // Catch: java.lang.NoSuchFieldError -> L1d
                com.bxkj.student.common.utils.Captcha$TYPE r1 = com.bxkj.student.common.utils.Captcha.TYPE.LETTER     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.bxkj.student.common.utils.Captcha.a.a     // Catch: java.lang.NoSuchFieldError -> L28
                com.bxkj.student.common.utils.Captcha$TYPE r1 = com.bxkj.student.common.utils.Captcha.TYPE.CHARS     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                return
        }

        public a() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    static {
            r0 = 10
            char[] r0 = new char[r0]
            r0 = {x001c: FILL_ARRAY_DATA , data: [48, 49, 50, 51, 52, 53, 54, 55, 56, 57} // fill-array
            com.bxkj.student.common.utils.Captcha.f756n = r0
            r0 = 52
            char[] r0 = new char[r0]
            r0 = {x002a: FILL_ARRAY_DATA , data: [97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90} // fill-array
            com.bxkj.student.common.utils.Captcha.f757o = r0
            r0 = 62
            char[] r0 = new char[r0]
            r0 = {x0062: FILL_ARRAY_DATA , data: [48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90} // fill-array
            com.bxkj.student.common.utils.Captcha.f758p = r0
            return
    }

    private Captcha() {
            r1 = this;
            r1.<init>()
            com.bxkj.student.common.utils.Captcha$TYPE r0 = com.bxkj.student.common.utils.Captcha.TYPE.CHARS
            r1.k = r0
            r0 = 200(0xc8, float:2.8E-43)
            r1.a = r0
            r0 = 80
            r1.b = r0
            r0 = -1
            r1.c = r0
            r0 = 4
            r1.d = r0
            r0 = 2
            r1.e = r0
            r0 = 50
            r1.f = r0
            r0 = 20
            r1.g = r0
            r1.h = r0
            r0 = 45
            r1.i = r0
            r0 = 15
            r1.j = r0
            java.util.Random r0 = new java.util.Random
            r0.<init>()
            r1.f760l = r0
            return
    }

    private java.lang.String b() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int[] r1 = com.bxkj.student.common.utils.Captcha.a.a
            com.bxkj.student.common.utils.Captcha$TYPE r2 = r5.k
            int r2 = r2.ordinal()
            r1 = r1[r2]
            r2 = 1
            r3 = 0
            if (r1 == r2) goto L58
            r2 = 2
            if (r1 == r2) goto L43
            r2 = 3
            if (r1 == r2) goto L2e
        L19:
            int r1 = r5.d
            if (r3 >= r1) goto L6d
            char[] r1 = com.bxkj.student.common.utils.Captcha.f758p
            java.util.Random r2 = r5.f760l
            int r4 = r1.length
            int r2 = r2.nextInt(r4)
            char r1 = r1[r2]
            r0.append(r1)
            int r3 = r3 + 1
            goto L19
        L2e:
            int r1 = r5.d
            if (r3 >= r1) goto L6d
            char[] r1 = com.bxkj.student.common.utils.Captcha.f758p
            java.util.Random r2 = r5.f760l
            int r4 = r1.length
            int r2 = r2.nextInt(r4)
            char r1 = r1[r2]
            r0.append(r1)
            int r3 = r3 + 1
            goto L2e
        L43:
            int r1 = r5.d
            if (r3 >= r1) goto L6d
            char[] r1 = com.bxkj.student.common.utils.Captcha.f757o
            java.util.Random r2 = r5.f760l
            int r4 = r1.length
            int r2 = r2.nextInt(r4)
            char r1 = r1[r2]
            r0.append(r1)
            int r3 = r3 + 1
            goto L43
        L58:
            int r1 = r5.d
            if (r3 >= r1) goto L6d
            char[] r1 = com.bxkj.student.common.utils.Captcha.f756n
            java.util.Random r2 = r5.f760l
            int r4 = r1.length
            int r2 = r2.nextInt(r4)
            char r1 = r1[r2]
            r0.append(r1)
            int r3 = r3 + 1
            goto L58
        L6d:
            java.lang.String r0 = r0.toString()
            return r0
    }

    private void c(android.graphics.Canvas r13, android.graphics.Paint r14) {
            r12 = this;
            int r0 = r12.f()
            java.util.Random r1 = r12.f760l
            int r2 = r12.a
            int r1 = r1.nextInt(r2)
            java.util.Random r2 = r12.f760l
            int r3 = r12.b
            int r2 = r2.nextInt(r3)
            java.util.Random r3 = r12.f760l
            int r4 = r12.a
            int r3 = r3.nextInt(r4)
            java.util.Random r4 = r12.f760l
            int r5 = r12.b
            int r4 = r4.nextInt(r5)
            r5 = 1065353216(0x3f800000, float:1.0)
            r14.setStrokeWidth(r5)
            r14.setColor(r0)
            float r7 = (float) r1
            float r8 = (float) r2
            float r9 = (float) r3
            float r10 = (float) r4
            r6 = r13
            r11 = r14
            r6.drawLine(r7, r8, r9, r10, r11)
            return
    }

    public static com.bxkj.student.common.utils.Captcha e() {
            com.bxkj.student.common.utils.Captcha r0 = com.bxkj.student.common.utils.Captcha.f759q
            if (r0 != 0) goto L13
            java.lang.Class<com.bxkj.student.common.utils.Captcha> r0 = com.bxkj.student.common.utils.Captcha.class
            monitor-enter(r0)
            com.bxkj.student.common.utils.Captcha r1 = new com.bxkj.student.common.utils.Captcha     // Catch: java.lang.Throwable -> L10
            r1.<init>()     // Catch: java.lang.Throwable -> L10
            com.bxkj.student.common.utils.Captcha.f759q = r1     // Catch: java.lang.Throwable -> L10
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            goto L13
        L10:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            throw r1
        L13:
            com.bxkj.student.common.utils.Captcha r0 = com.bxkj.student.common.utils.Captcha.f759q
            return r0
    }

    private int f() {
            r4 = this;
            java.util.Random r0 = r4.f760l
            r1 = 256(0x100, float:3.59E-43)
            int r0 = r0.nextInt(r1)
            java.util.Random r2 = r4.f760l
            int r2 = r2.nextInt(r1)
            java.util.Random r3 = r4.f760l
            int r1 = r3.nextInt(r1)
            int r0 = android.graphics.Color.rgb(r0, r2, r1)
            return r0
    }

    private int g() {
            r3 = this;
            int r0 = r3.g
            java.util.Random r1 = r3.f760l
            int r2 = r3.h
            int r1 = r1.nextInt(r2)
            int r0 = r0 + r1
            return r0
    }

    private int h() {
            r3 = this;
            int r0 = r3.i
            java.util.Random r1 = r3.f760l
            int r2 = r3.j
            int r1 = r1.nextInt(r2)
            int r0 = r0 + r1
            return r0
    }

    private void i(android.graphics.Paint r3) {
            r2 = this;
            int r0 = r2.f()
            r3.setColor(r0)
            java.util.Random r0 = r2.f760l
            boolean r0 = r0.nextBoolean()
            r3.setFakeBoldText(r0)
            java.util.Random r0 = r2.f760l
            r1 = 11
            int r0 = r0.nextInt(r1)
            int r0 = r0 / 10
            java.util.Random r1 = r2.f760l
            boolean r1 = r1.nextBoolean()
            if (r1 == 0) goto L23
            goto L24
        L23:
            int r0 = -r0
        L24:
            float r0 = (float) r0
            r3.setTextSkewX(r0)
            return
    }

    public android.graphics.Bitmap a() {
            r9 = this;
            java.lang.String r0 = r9.b()
            r9.f761m = r0
            int r0 = r9.a
            int r1 = r9.b
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r0, r1, r2)
            android.graphics.Canvas r1 = new android.graphics.Canvas
            r1.<init>(r0)
            int r2 = r9.c
            r1.drawColor(r2)
            android.graphics.Paint r2 = new android.graphics.Paint
            r2.<init>()
            int r3 = r9.f
            float r3 = (float) r3
            r2.setTextSize(r3)
            r3 = 0
            r4 = 0
            r5 = 0
        L28:
            java.lang.String r6 = r9.f761m
            int r6 = r6.length()
            if (r4 >= r6) goto L4e
            r9.i(r2)
            int r6 = r9.g()
            int r5 = r5 + r6
            java.lang.String r6 = r9.f761m
            char r6 = r6.charAt(r4)
            java.lang.String r6 = java.lang.String.valueOf(r6)
            float r7 = (float) r5
            int r8 = r9.h()
            float r8 = (float) r8
            r1.drawText(r6, r7, r8, r2)
            int r4 = r4 + 1
            goto L28
        L4e:
            int r4 = r9.e
            if (r3 >= r4) goto L58
            r9.c(r1, r2)
            int r3 = r3 + 1
            goto L4e
        L58:
            r1.save()
            r1.restore()
            return r0
    }

    public java.lang.String d() {
            r1 = this;
            java.lang.String r0 = r1.f761m
            return r0
    }

    public com.bxkj.student.common.utils.Captcha j(int r1) {
            r0 = this;
            r0.c = r1
            com.bxkj.student.common.utils.Captcha r1 = com.bxkj.student.common.utils.Captcha.f759q
            return r1
    }

    public com.bxkj.student.common.utils.Captcha k(int r1, int r2) {
            r0 = this;
            r0.g = r1
            r0.i = r2
            com.bxkj.student.common.utils.Captcha r1 = com.bxkj.student.common.utils.Captcha.f759q
            return r1
    }

    public com.bxkj.student.common.utils.Captcha l(int r1, int r2, int r3, int r4) {
            r0 = this;
            r0.g = r1
            r0.h = r2
            r0.i = r3
            r0.j = r4
            com.bxkj.student.common.utils.Captcha r1 = com.bxkj.student.common.utils.Captcha.f759q
            return r1
    }

    public com.bxkj.student.common.utils.Captcha m(int r1) {
            r0 = this;
            r0.f = r1
            com.bxkj.student.common.utils.Captcha r1 = com.bxkj.student.common.utils.Captcha.f759q
            return r1
    }

    public com.bxkj.student.common.utils.Captcha n(int r1) {
            r0 = this;
            r0.d = r1
            com.bxkj.student.common.utils.Captcha r1 = com.bxkj.student.common.utils.Captcha.f759q
            return r1
    }

    public com.bxkj.student.common.utils.Captcha o(int r1) {
            r0 = this;
            r0.e = r1
            com.bxkj.student.common.utils.Captcha r1 = com.bxkj.student.common.utils.Captcha.f759q
            return r1
    }

    public com.bxkj.student.common.utils.Captcha p(int r1, int r2) {
            r0 = this;
            r0.a = r1
            r0.b = r2
            com.bxkj.student.common.utils.Captcha r1 = com.bxkj.student.common.utils.Captcha.f759q
            return r1
    }

    public com.bxkj.student.common.utils.Captcha q(com.bxkj.student.common.utils.Captcha.TYPE r1) {
            r0 = this;
            r0.k = r1
            com.bxkj.student.common.utils.Captcha r1 = com.bxkj.student.common.utils.Captcha.f759q
            return r1
    }
}
