package com.acse.ottn;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class k {
    public static final int[] a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final int f2418b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f2419c = null;

    /* renamed from: d, reason: collision with root package name */
    public static final int f2420d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f2421e = null;

    /* renamed from: f, reason: collision with root package name */
    public static final int f2422f = 0;

    /* renamed from: g, reason: collision with root package name */
    public static final int f2423g = 1;

    /* renamed from: h, reason: collision with root package name */
    public static final int f2424h = 2;

    /* renamed from: i, reason: collision with root package name */
    public static final int f2425i = 3;

    /* renamed from: j, reason: collision with root package name */
    public static final int f2426j = 4;

    /* renamed from: k, reason: collision with root package name */
    public static final int f2427k = 5;
    public static final int l = 6;
    public static final int m = 7;
    public static final int n = 0;
    public static final int o = 0;

    static {
            r0 = 16843490(0x10102e2, float:2.3695626E-38)
            int[] r0 = new int[]{r0}
            com.acse.ottn.k.a = r0
            r0 = 16843489(0x10102e1, float:2.3695624E-38)
            int[] r0 = new int[]{r0}
            com.acse.ottn.k.f2419c = r0
            r0 = 8
            int[] r0 = new int[r0]
            r0 = {x001c: FILL_ARRAY_DATA , data: [16843073, 16843160, 16843198, 16843199, 16843200, 16843486, 16843487, 16843488} // fill-array
            com.acse.ottn.k.f2421e = r0
            return
    }

    public k() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.acse.ottn.j a(android.content.Context r4, int r5) throws android.content.res.Resources.NotFoundException {
            java.lang.String r0 = "Can't load animation resource ID #0x"
            r1 = 0
            android.content.res.Resources r2 = r4.getResources()     // Catch: java.lang.Throwable -> L15 java.io.IOException -> L17 org.xmlpull.v1.XmlPullParserException -> L19
            android.content.res.XmlResourceParser r1 = r2.getAnimation(r5)     // Catch: java.lang.Throwable -> L15 java.io.IOException -> L17 org.xmlpull.v1.XmlPullParserException -> L19
            com.acse.ottn.j r4 = a(r4, r1)     // Catch: java.lang.Throwable -> L15 java.io.IOException -> L17 org.xmlpull.v1.XmlPullParserException -> L19
            if (r1 == 0) goto L14
            r1.close()
        L14:
            return r4
        L15:
            r4 = move-exception
            goto L53
        L17:
            r4 = move-exception
            goto L1b
        L19:
            r4 = move-exception
            goto L37
        L1b:
            android.content.res.Resources$NotFoundException r2 = new android.content.res.Resources$NotFoundException     // Catch: java.lang.Throwable -> L15
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L15
            r3.<init>()     // Catch: java.lang.Throwable -> L15
            r3.append(r0)     // Catch: java.lang.Throwable -> L15
            java.lang.String r5 = java.lang.Integer.toHexString(r5)     // Catch: java.lang.Throwable -> L15
            r3.append(r5)     // Catch: java.lang.Throwable -> L15
            java.lang.String r5 = r3.toString()     // Catch: java.lang.Throwable -> L15
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L15
            r2.initCause(r4)     // Catch: java.lang.Throwable -> L15
            throw r2     // Catch: java.lang.Throwable -> L15
        L37:
            android.content.res.Resources$NotFoundException r2 = new android.content.res.Resources$NotFoundException     // Catch: java.lang.Throwable -> L15
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L15
            r3.<init>()     // Catch: java.lang.Throwable -> L15
            r3.append(r0)     // Catch: java.lang.Throwable -> L15
            java.lang.String r5 = java.lang.Integer.toHexString(r5)     // Catch: java.lang.Throwable -> L15
            r3.append(r5)     // Catch: java.lang.Throwable -> L15
            java.lang.String r5 = r3.toString()     // Catch: java.lang.Throwable -> L15
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L15
            r2.initCause(r4)     // Catch: java.lang.Throwable -> L15
            throw r2     // Catch: java.lang.Throwable -> L15
        L53:
            if (r1 == 0) goto L58
            r1.close()
        L58:
            throw r4
    }

    public static com.acse.ottn.j a(android.content.Context r3, org.xmlpull.v1.XmlPullParser r4) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r4)
            r1 = 0
            r2 = 0
            com.acse.ottn.j r3 = a(r3, r4, r0, r1, r2)
            return r3
    }

    public static com.acse.ottn.j a(android.content.Context r9, org.xmlpull.v1.XmlPullParser r10, android.util.AttributeSet r11, com.acse.ottn.n r12, int r13) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            int r0 = r10.getDepth()
            r1 = 0
            r2 = r1
            r3 = r2
        L7:
            int r4 = r10.next()
            r5 = 3
            r6 = 0
            if (r4 != r5) goto L15
            int r5 = r10.getDepth()
            if (r5 <= r0) goto L8b
        L15:
            r5 = 1
            if (r4 == r5) goto L8b
            r5 = 2
            if (r4 == r5) goto L1c
            goto L7
        L1c:
            java.lang.String r3 = r10.getName()
            java.lang.String r4 = "objectAnimator"
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L2d
            com.acse.ottn.z2 r3 = a(r9, r11)
            goto L63
        L2d:
            java.lang.String r4 = "animator"
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L3a
            com.acse.ottn.r4 r3 = a(r9, r11, r1)
            goto L63
        L3a:
            java.lang.String r4 = "set"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L70
            com.acse.ottn.n r3 = new com.acse.ottn.n
            r3.<init>()
            int[] r4 = com.acse.ottn.k.a
            android.content.res.TypedArray r4 = r9.obtainStyledAttributes(r11, r4)
            android.util.TypedValue r5 = new android.util.TypedValue
            r5.<init>()
            r4.getValue(r6, r5)
            int r7 = r5.type
            r8 = 16
            if (r7 != r8) goto L5d
            int r6 = r5.data
        L5d:
            a(r9, r10, r11, r3, r6)
            r4.recycle()
        L63:
            if (r12 == 0) goto L7
            if (r2 != 0) goto L6c
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L6c:
            r2.add(r3)
            goto L7
        L70:
            java.lang.RuntimeException r9 = new java.lang.RuntimeException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "Unknown animator name: "
            r11.append(r12)
            java.lang.String r10 = r10.getName()
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            r9.<init>(r10)
            throw r9
        L8b:
            if (r12 == 0) goto Lb4
            if (r2 == 0) goto Lb4
            int r9 = r2.size()
            com.acse.ottn.j[] r9 = new com.acse.ottn.j[r9]
            java.util.Iterator r10 = r2.iterator()
        L99:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto Lab
            java.lang.Object r11 = r10.next()
            com.acse.ottn.j r11 = (com.acse.ottn.j) r11
            int r0 = r6 + 1
            r9[r6] = r11
            r6 = r0
            goto L99
        Lab:
            if (r13 != 0) goto Lb1
            r12.b(r9)
            return r3
        Lb1:
            r12.a(r9)
        Lb4:
            return r3
    }

    public static com.acse.ottn.r4 a(android.content.Context r18, android.util.AttributeSet r19, com.acse.ottn.r4 r20) throws android.content.res.Resources.NotFoundException {
            r0 = r18
            int[] r1 = com.acse.ottn.k.f2421e
            r2 = r19
            android.content.res.TypedArray r1 = r0.obtainStyledAttributes(r2, r1)
            r2 = 1
            r3 = 0
            int r4 = r1.getInt(r2, r3)
            long r4 = (long) r4
            r6 = 2
            int r7 = r1.getInt(r6, r3)
            long r7 = (long) r7
            r9 = 7
            int r9 = r1.getInt(r9, r3)
            if (r20 != 0) goto L24
            com.acse.ottn.r4 r10 = new com.acse.ottn.r4
            r10.<init>()
            goto L26
        L24:
            r10 = r20
        L26:
            if (r9 != 0) goto L2a
            r9 = 1
            goto L2b
        L2a:
            r9 = 0
        L2b:
            r11 = 5
            android.util.TypedValue r12 = r1.peekValue(r11)
            if (r12 == 0) goto L34
            r13 = 1
            goto L35
        L34:
            r13 = 0
        L35:
            if (r13 == 0) goto L3a
            int r12 = r12.type
            goto L3b
        L3a:
            r12 = 0
        L3b:
            r14 = 6
            android.util.TypedValue r15 = r1.peekValue(r14)
            if (r15 == 0) goto L45
            r16 = 1
            goto L47
        L45:
            r16 = 0
        L47:
            if (r16 == 0) goto L4e
            int r15 = r15.type
        L4b:
            r19 = 0
            goto L50
        L4e:
            r15 = 0
            goto L4b
        L50:
            r3 = 31
            r17 = 1
            r2 = 28
            if (r13 == 0) goto L5c
            if (r12 < r2) goto L5c
            if (r12 <= r3) goto L62
        L5c:
            if (r16 == 0) goto L6b
            if (r15 < r2) goto L6b
            if (r15 > r3) goto L6b
        L62:
            com.acse.ottn.s r9 = new com.acse.ottn.s
            r9.<init>()
            r10.a(r9)
            r9 = 0
        L6b:
            r3 = 0
            if (r9 == 0) goto Lb1
            if (r13 == 0) goto L9d
            if (r12 != r11) goto L77
            float r2 = r1.getDimension(r11, r3)
            goto L7b
        L77:
            float r2 = r1.getFloat(r11, r3)
        L7b:
            if (r16 == 0) goto L94
            if (r15 != r11) goto L84
            float r3 = r1.getDimension(r14, r3)
            goto L88
        L84:
            float r3 = r1.getFloat(r14, r3)
        L88:
            float[] r6 = new float[r6]
            r6[r19] = r2
            r6[r17] = r3
            r10.b(r6)
        L91:
            r6 = 0
            goto L11a
        L94:
            r6 = 1
            float[] r3 = new float[r6]
            r3[r19] = r2
            r10.b(r3)
            goto L91
        L9d:
            r6 = 1
            if (r15 != r11) goto La5
            float r2 = r1.getDimension(r14, r3)
            goto La9
        La5:
            float r2 = r1.getFloat(r14, r3)
        La9:
            float[] r3 = new float[r6]
            r3[r19] = r2
            r10.b(r3)
            goto L91
        Lb1:
            if (r13 == 0) goto Lf7
            if (r12 != r11) goto Lbd
            float r6 = r1.getDimension(r11, r3)
            int r6 = (int) r6
            r9 = r6
            r6 = 0
            goto Lce
        Lbd:
            if (r12 < r2) goto Lc9
            r6 = 31
            if (r12 > r6) goto Lc9
            r6 = 0
            int r9 = r1.getColor(r11, r6)
            goto Lce
        Lc9:
            r6 = 0
            int r9 = r1.getInt(r11, r6)
        Lce:
            if (r16 == 0) goto Lef
            if (r15 != r11) goto Ld8
            float r2 = r1.getDimension(r14, r3)
            int r2 = (int) r2
            goto Le7
        Ld8:
            if (r15 < r2) goto Le3
            r2 = 31
            if (r15 > r2) goto Le3
            int r2 = r1.getColor(r14, r6)
            goto Le7
        Le3:
            int r2 = r1.getInt(r14, r6)
        Le7:
            int[] r2 = new int[]{r9, r2}
            r10.b(r2)
            goto L91
        Lef:
            int[] r2 = new int[]{r9}
            r10.b(r2)
            goto L91
        Lf7:
            if (r16 == 0) goto L91
            if (r15 != r11) goto L102
            float r2 = r1.getDimension(r14, r3)
            int r2 = (int) r2
            r6 = 0
            goto L113
        L102:
            if (r15 < r2) goto L10e
            r2 = 31
            if (r15 > r2) goto L10e
            r6 = 0
            int r2 = r1.getColor(r14, r6)
            goto L113
        L10e:
            r6 = 0
            int r2 = r1.getInt(r14, r6)
        L113:
            int[] r2 = new int[]{r2}
            r10.b(r2)
        L11a:
            r10.f(r4)
            r10.b(r7)
            r2 = 3
            boolean r3 = r1.hasValue(r2)
            if (r3 == 0) goto L12e
            int r2 = r1.getInt(r2, r6)
            r10.a(r2)
        L12e:
            r2 = 4
            boolean r3 = r1.hasValue(r2)
            if (r3 == 0) goto L13d
            r3 = 1
            int r2 = r1.getInt(r2, r3)
            r10.b(r2)
        L13d:
            int r2 = r1.getResourceId(r6, r6)
            if (r2 <= 0) goto L14a
            android.view.animation.Interpolator r0 = android.view.animation.AnimationUtils.loadInterpolator(r0, r2)
            r10.a(r0)
        L14a:
            r1.recycle()
            return r10
    }

    public static com.acse.ottn.z2 a(android.content.Context r2, android.util.AttributeSet r3) throws android.content.res.Resources.NotFoundException {
            com.acse.ottn.z2 r0 = new com.acse.ottn.z2
            r0.<init>()
            a(r2, r3, r0)
            int[] r1 = com.acse.ottn.k.f2419c
            android.content.res.TypedArray r2 = r2.obtainStyledAttributes(r3, r1)
            r3 = 0
            java.lang.String r3 = r2.getString(r3)
            r0.b(r3)
            r2.recycle()
            return r0
    }
}
