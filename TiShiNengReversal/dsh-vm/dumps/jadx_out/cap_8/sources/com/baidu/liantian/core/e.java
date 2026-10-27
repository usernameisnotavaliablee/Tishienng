package com.baidu.liantian.core;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class e {




    public e() {
            r1 = this;
            r1.<init>()
            return
    }

    public static android.os.Bundle a(android.content.Context r18, java.lang.String r19, android.os.Bundle r20) {
            r0 = r19
            r1 = r20
            java.lang.String r2 = "status"
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L1a1
            java.lang.String r4 = "gzfi"
            boolean r4 = r4.equals(r0)     // Catch: java.lang.Throwable -> L1a1
            r6 = 8
            r7 = 3
            java.lang.String r8 = "args"
            java.lang.Class<com.baidu.liantian.LiantianProvider> r9 = com.baidu.liantian.LiantianProvider.class
            r10 = 2
            java.lang.String r11 = "result"
            r12 = 0
            r13 = 0
            r14 = 1
            if (r4 == 0) goto Lc2
            if (r1 == 0) goto L1a4
            com.baidu.liantian.core.c r0 = new com.baidu.liantian.core.c     // Catch: java.lang.Throwable -> L1a1
            r0.<init>()     // Catch: java.lang.Throwable -> L1a1
            java.lang.ClassLoader r4 = r9.getClassLoader()     // Catch: java.lang.Throwable -> Lb9
            r1.setClassLoader(r4)     // Catch: java.lang.Throwable -> Lb9
            android.os.Parcelable r1 = r1.getParcelable(r8)     // Catch: java.lang.Throwable -> Lb9
            com.baidu.liantian.core.c r1 = (com.baidu.liantian.core.c) r1     // Catch: java.lang.Throwable -> Lb9
            if (r1 == 0) goto L62
            java.lang.Object[] r1 = r1.f5949e     // Catch: java.lang.Throwable -> Lb9
            int r4 = r1.length     // Catch: java.lang.Throwable -> Lb9
            if (r4 != r10) goto L4c
            r4 = r1[r12]     // Catch: java.lang.Throwable -> Lb9
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> Lb9
            r1 = r1[r14]     // Catch: java.lang.Throwable -> Lb9
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> Lb9
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> Lb9
            r8 = r4
            r4 = r13
            goto L65
        L4c:
            int r4 = r1.length     // Catch: java.lang.Throwable -> Lb9
            if (r4 != r7) goto L62
            r4 = r1[r12]     // Catch: java.lang.Throwable -> Lb9
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> Lb9
            r8 = r1[r14]     // Catch: java.lang.Throwable -> Lb9
            java.lang.Integer r8 = (java.lang.Integer) r8     // Catch: java.lang.Throwable -> Lb9
            r1 = r1[r10]     // Catch: java.lang.Throwable -> Lb9
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> Lb9
            r17 = r4
            r4 = r1
            r1 = r8
            r8 = r17
            goto L65
        L62:
            r1 = r13
            r4 = r1
            r8 = r4
        L65:
            int r9 = r1.intValue()     // Catch: java.lang.Throwable -> Lb9
            if (r9 == 0) goto L9a
            boolean r9 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> Lb9
            java.lang.Class r15 = java.lang.Integer.TYPE
            java.lang.String r5 = "ice"
            java.lang.Class<java.lang.String> r16 = java.lang.String.class
            if (r9 == 0) goto L87
            java.lang.Class[] r4 = new java.lang.Class[r10]     // Catch: java.lang.Throwable -> Lb9
            r4[r12] = r16     // Catch: java.lang.Throwable -> Lb9
            r4[r14] = r15     // Catch: java.lang.Throwable -> Lb9
            java.lang.Object[] r7 = new java.lang.Object[r10]     // Catch: java.lang.Throwable -> Lb9
            r7[r12] = r8     // Catch: java.lang.Throwable -> Lb9
            r7[r14] = r1     // Catch: java.lang.Throwable -> Lb9
            a(r14, r5, r13, r4, r7)     // Catch: java.lang.Throwable -> Lb9
            goto L9a
        L87:
            java.lang.Class[] r9 = new java.lang.Class[r7]     // Catch: java.lang.Throwable -> Lb9
            r9[r12] = r16     // Catch: java.lang.Throwable -> Lb9
            r9[r14] = r15     // Catch: java.lang.Throwable -> Lb9
            r9[r10] = r16     // Catch: java.lang.Throwable -> Lb9
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch: java.lang.Throwable -> Lb9
            r7[r12] = r8     // Catch: java.lang.Throwable -> Lb9
            r7[r14] = r1     // Catch: java.lang.Throwable -> Lb9
            r7[r10] = r4     // Catch: java.lang.Throwable -> Lb9
            a(r14, r5, r13, r9, r7)     // Catch: java.lang.Throwable -> Lb9
        L9a:
            java.lang.String r1 = b(r18)     // Catch: java.lang.Throwable -> Lb9
            boolean r4 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> Lb9
            if (r4 == 0) goto La8
            r3.putInt(r2, r6)     // Catch: java.lang.Throwable -> Lb9
            return r3
        La8:
            r0.f5950f = r1     // Catch: java.lang.Throwable -> Lb9
            java.lang.Object r1 = r0.f5950f     // Catch: java.lang.Throwable -> Lb9
            java.util.Objects.toString(r1)     // Catch: java.lang.Throwable -> Lb9
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> Lb9
            r3.putParcelable(r11, r0)     // Catch: java.lang.Throwable -> Lb9
            r3.putInt(r2, r12)     // Catch: java.lang.Throwable -> Lb9
            return r3
        Lb9:
            com.baidu.liantian.b.e.a()     // Catch: java.lang.Throwable -> L1a1
            r0 = 7
            r3.putInt(r2, r0)     // Catch: java.lang.Throwable -> L1a1
            goto L170
        Lc2:
            java.lang.String r4 = "invokeMethod"
            boolean r4 = r4.equals(r0)     // Catch: java.lang.Throwable -> L1a1
            if (r4 == 0) goto L171
            if (r1 == 0) goto L1a4
            com.baidu.liantian.core.c r0 = new com.baidu.liantian.core.c     // Catch: java.lang.Throwable -> L1a1
            r0.<init>()     // Catch: java.lang.Throwable -> L1a1
            java.lang.ClassLoader r4 = r9.getClassLoader()     // Catch: java.lang.Throwable -> L166
            r1.setClassLoader(r4)     // Catch: java.lang.Throwable -> L166
            android.os.Parcelable r1 = r1.getParcelable(r8)     // Catch: java.lang.Throwable -> L166
            com.baidu.liantian.core.c r1 = (com.baidu.liantian.core.c) r1     // Catch: java.lang.Throwable -> L166
            int r4 = r1.a     // Catch: java.lang.Throwable -> L166
            int r5 = r1.f5946b     // Catch: java.lang.Throwable -> L166
            java.lang.String r6 = r1.f5947c     // Catch: java.lang.Throwable -> L166
            java.lang.Object[] r8 = r1.f5948d     // Catch: java.lang.Throwable -> L166
            if (r8 == 0) goto L11c
            int r9 = r8.length     // Catch: java.lang.Throwable -> L166
            java.lang.Class[] r13 = new java.lang.Class[r9]     // Catch: java.lang.Throwable -> L166
        Leb:
            int r9 = r8.length     // Catch: java.lang.Throwable -> L166
            if (r12 >= r9) goto L11c
            r9 = r8[r12]     // Catch: java.lang.Throwable -> L166
            java.lang.String r9 = (java.lang.String) r9     // Catch: java.lang.Throwable -> L166
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L166
            boolean r10 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Throwable -> L166
            if (r10 != 0) goto L10f
            java.lang.String r10 = "@@"
            boolean r10 = r9.contains(r10)     // Catch: java.lang.Throwable -> L166
            if (r10 == 0) goto L10f
            java.lang.Class r9 = com.baidu.liantian.b.e.a(r9)     // Catch: java.lang.Throwable -> L166
            if (r9 == 0) goto L119
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L166
            r13[r12] = r9     // Catch: java.lang.Throwable -> L166
            goto L119
        L10f:
            r9 = r8[r12]     // Catch: java.lang.Throwable -> L166
            java.lang.String r9 = (java.lang.String) r9     // Catch: java.lang.Throwable -> L166
            java.lang.Class r9 = java.lang.Class.forName(r9)     // Catch: java.lang.Throwable -> L166
            r13[r12] = r9     // Catch: java.lang.Throwable -> L166
        L119:
            int r12 = r12 + 1
            goto Leb
        L11c:
            java.lang.Object[] r1 = r1.f5949e     // Catch: java.lang.Throwable -> L166
            if (r5 != r14) goto L13e
            android.util.Pair r1 = a(r4, r6, r13, r1)     // Catch: java.lang.Throwable -> L166
            java.lang.Object r4 = r1.first     // Catch: java.lang.Throwable -> L166
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch: java.lang.Throwable -> L166
            int r4 = r4.intValue()     // Catch: java.lang.Throwable -> L166
            r3.putInt(r2, r4)     // Catch: java.lang.Throwable -> L166
            java.lang.Object r4 = r1.first     // Catch: java.lang.Throwable -> L166
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch: java.lang.Throwable -> L166
            int r4 = r4.intValue()     // Catch: java.lang.Throwable -> L166
            if (r4 != 0) goto L15c
            java.lang.Object r1 = r1.second     // Catch: java.lang.Throwable -> L166
            r0.f5950f = r1     // Catch: java.lang.Throwable -> L166
            goto L15c
        L13e:
            if (r5 != 0) goto L15c
            java.util.concurrent.CountDownLatch r5 = new java.util.concurrent.CountDownLatch     // Catch: java.lang.Throwable -> L166
            r5.<init>(r14)     // Catch: java.lang.Throwable -> L166
            com.baidu.liantian.core.e$2 r8 = new com.baidu.liantian.core.e$2     // Catch: java.lang.Throwable -> L166
            r8.<init>(r3, r0, r5, r6)     // Catch: java.lang.Throwable -> L166
            a(r4, r6, r8, r13, r1)     // Catch: java.lang.Throwable -> L166
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> L156
            r8 = 180000(0x2bf20, double:8.8932E-319)
            r5.await(r8, r1)     // Catch: java.lang.Throwable -> L156
            goto L15c
        L156:
            r3.putInt(r2, r7)     // Catch: java.lang.Throwable -> L166
            com.baidu.liantian.b.e.a()     // Catch: java.lang.Throwable -> L166
        L15c:
            r3.getInt(r2)     // Catch: java.lang.Throwable -> L166
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L166
            r3.putParcelable(r11, r0)     // Catch: java.lang.Throwable -> L166
            goto L170
        L166:
            com.baidu.liantian.b.e.a()     // Catch: java.lang.Throwable -> L1a1
            r3.putParcelable(r11, r0)     // Catch: java.lang.Throwable -> L1a1
            r0 = 7
            r3.putInt(r2, r0)     // Catch: java.lang.Throwable -> L1a1
        L170:
            return r3
        L171:
            java.lang.String r1 = "gz"
            boolean r0 = r1.equals(r0)     // Catch: java.lang.Throwable -> L1a1
            if (r0 == 0) goto L19d
            java.lang.String r0 = b(r18)     // Catch: java.lang.Throwable -> L1a1
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L1a1
            if (r1 == 0) goto L187
            r3.putInt(r2, r6)     // Catch: java.lang.Throwable -> L1a1
            return r3
        L187:
            com.baidu.liantian.core.c r1 = new com.baidu.liantian.core.c     // Catch: java.lang.Throwable -> L1a1
            r1.<init>()     // Catch: java.lang.Throwable -> L1a1
            r1.f5950f = r0     // Catch: java.lang.Throwable -> L1a1
            java.lang.Object r0 = r1.f5950f     // Catch: java.lang.Throwable -> L1a1
            java.util.Objects.toString(r0)     // Catch: java.lang.Throwable -> L1a1
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L1a1
            r3.putParcelable(r11, r1)     // Catch: java.lang.Throwable -> L1a1
            r3.putInt(r2, r12)     // Catch: java.lang.Throwable -> L1a1
            return r3
        L19d:
            r3.putInt(r2, r10)     // Catch: java.lang.Throwable -> L1a1
            return r3
        L1a1:
            com.baidu.liantian.b.e.a()
        L1a4:
            r0 = 10
            r3.putInt(r2, r0)
            return r3
    }

    private static android.util.Pair<java.lang.Integer, java.lang.Object> a(int r4, java.lang.String r5, java.lang.Class<?>[] r6, java.lang.Object... r7) {
            r0 = 0
            android.content.Context r1 = com.baidu.liantian.core.d.f5951b     // Catch: java.lang.Throwable -> L71
            if (r1 != 0) goto L10
            android.util.Pair r4 = new android.util.Pair     // Catch: java.lang.Throwable -> L71
            r5 = 4
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L71
            r4.<init>(r5, r0)     // Catch: java.lang.Throwable -> L71
            return r4
        L10:
            r2 = 0
            boolean r2 = com.baidu.liantian.b.e.a(r1, r2)     // Catch: java.lang.Throwable -> L71
            if (r2 != 0) goto L26
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L71
            android.util.Pair r4 = new android.util.Pair     // Catch: java.lang.Throwable -> L71
            r5 = 11
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L71
            r4.<init>(r5, r0)     // Catch: java.lang.Throwable -> L71
            return r4
        L26:
            android.content.Context r2 = com.baidu.liantian.core.d.f5951b     // Catch: java.lang.Throwable -> L71
            java.lang.String r2 = com.baidu.liantian.b.e.b(r2)     // Catch: java.lang.Throwable -> L71
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L71
            if (r3 == 0) goto L55
            android.content.Context r2 = com.baidu.liantian.core.d.f5951b     // Catch: java.lang.Throwable -> L71
            java.lang.String r2 = r2.getPackageName()     // Catch: java.lang.Throwable -> L71
            boolean r2 = com.baidu.liantian.b.e.b(r2)     // Catch: java.lang.Throwable -> L71
            if (r2 == 0) goto L49
            android.util.Pair r4 = new android.util.Pair     // Catch: java.lang.Throwable -> L71
            r5 = 5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L71
            r4.<init>(r5, r0)     // Catch: java.lang.Throwable -> L71
            return r4
        L49:
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L71
            com.baidu.liantian.core.d r1 = com.baidu.liantian.core.d.a(r1)     // Catch: java.lang.Throwable -> L71
            android.util.Pair r4 = r1.a(r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L71
            return r4
        L55:
            boolean r2 = com.baidu.liantian.b.e.b(r2)     // Catch: java.lang.Throwable -> L71
            if (r2 == 0) goto L65
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L71
            android.content.Context r1 = com.baidu.liantian.core.d.f5951b     // Catch: java.lang.Throwable -> L71
            android.util.Pair r4 = a(r1, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L71
            return r4
        L65:
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L71
            com.baidu.liantian.core.d r1 = com.baidu.liantian.core.d.a(r1)     // Catch: java.lang.Throwable -> L71
            android.util.Pair r4 = r1.a(r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L71
            return r4
        L71:
            com.baidu.liantian.b.e.a()
            android.util.Pair r4 = new android.util.Pair
            r5 = 3
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4.<init>(r5, r0)
            return r4
    }

    static android.util.Pair<java.lang.Integer, java.lang.Object> a(android.content.Context r5, int r6, int r7, java.lang.String r8, java.lang.Class<?>[] r9, java.lang.Object... r10) {
            r0 = 3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1 = 0
            boolean r2 = android.text.TextUtils.isEmpty(r8)     // Catch: java.lang.Throwable -> Ld7
            if (r2 == 0) goto L16
            r5 = 1
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> Ld7
            android.util.Pair r5 = android.util.Pair.create(r5, r1)     // Catch: java.lang.Throwable -> Ld7
            return r5
        L16:
            java.lang.String r2 = "gzfi"
            boolean r2 = r2.equals(r8)     // Catch: java.lang.Throwable -> Ld7
            if (r2 != 0) goto L2a
            java.lang.String r2 = "gz"
            boolean r2 = r2.equals(r8)     // Catch: java.lang.Throwable -> Ld7
            if (r2 == 0) goto L27
            goto L2a
        L27:
            java.lang.String r2 = "invokeMethod"
            goto L2b
        L2a:
            r2 = r8
        L2b:
            com.baidu.liantian.core.c r3 = new com.baidu.liantian.core.c     // Catch: java.lang.Throwable -> Ld7
            r3.<init>()     // Catch: java.lang.Throwable -> Ld7
            r3.a = r6     // Catch: java.lang.Throwable -> Ld7
            r3.f5947c = r8     // Catch: java.lang.Throwable -> Ld7
            r3.f5946b = r7     // Catch: java.lang.Throwable -> Ld7
            if (r9 == 0) goto L74
            int r6 = r9.length     // Catch: java.lang.Throwable -> Ld7
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> Ld7
            r7 = 0
        L3c:
            int r8 = r9.length     // Catch: java.lang.Throwable -> Ld7
            if (r7 >= r8) goto L72
            r8 = r9[r7]     // Catch: java.lang.Throwable -> Ld7
            boolean r8 = r8.isPrimitive()     // Catch: java.lang.Throwable -> Ld7
            if (r8 == 0) goto L67
            r8 = r9[r7]     // Catch: java.lang.Throwable -> Ld7
            java.lang.String r8 = com.baidu.liantian.b.e.a(r8)     // Catch: java.lang.Throwable -> Ld7
            boolean r4 = android.text.TextUtils.isEmpty(r8)     // Catch: java.lang.Throwable -> Ld7
            if (r4 != 0) goto L6f
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld7
            r4.<init>()     // Catch: java.lang.Throwable -> Ld7
            r4.append(r8)     // Catch: java.lang.Throwable -> Ld7
            java.lang.String r8 = "@@"
            r4.append(r8)     // Catch: java.lang.Throwable -> Ld7
            java.lang.String r8 = r4.toString()     // Catch: java.lang.Throwable -> Ld7
            r6[r7] = r8     // Catch: java.lang.Throwable -> Ld7
            goto L6f
        L67:
            r8 = r9[r7]     // Catch: java.lang.Throwable -> Ld7
            java.lang.String r8 = r8.getCanonicalName()     // Catch: java.lang.Throwable -> Ld7
            r6[r7] = r8     // Catch: java.lang.Throwable -> Ld7
        L6f:
            int r7 = r7 + 1
            goto L3c
        L72:
            r3.f5948d = r6     // Catch: java.lang.Throwable -> Ld7
        L74:
            r3.f5949e = r10     // Catch: java.lang.Throwable -> Ld7
            android.os.Bundle r6 = new android.os.Bundle     // Catch: java.lang.Throwable -> Ld7
            r6.<init>()     // Catch: java.lang.Throwable -> Ld7
            java.lang.String r7 = "args"
            r6.putParcelable(r7, r3)     // Catch: java.lang.Throwable -> Ld7
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld7
            java.lang.String r8 = "content://"
            r7.<init>(r8)     // Catch: java.lang.Throwable -> Ld7
            java.lang.String r8 = r5.getPackageName()     // Catch: java.lang.Throwable -> Ld7
            r7.append(r8)     // Catch: java.lang.Throwable -> Ld7
            java.lang.String r8 = ".liantian.ac.provider"
            r7.append(r8)     // Catch: java.lang.Throwable -> Ld7
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> Ld7
            android.net.Uri r7 = android.net.Uri.parse(r7)     // Catch: java.lang.Throwable -> Ld7
            android.content.ContentResolver r5 = r5.getContentResolver()     // Catch: java.lang.Throwable -> Ld7
            android.os.Bundle r5 = r5.call(r7, r2, r1, r6)     // Catch: java.lang.Throwable -> Ld7
            if (r5 != 0) goto Laa
            android.util.Pair r5 = android.util.Pair.create(r0, r1)     // Catch: java.lang.Throwable -> Ld7
            return r5
        Laa:
            java.lang.Class<com.baidu.liantian.core.c> r6 = com.baidu.liantian.core.c.class
            java.lang.ClassLoader r6 = r6.getClassLoader()     // Catch: java.lang.Throwable -> Ld7
            r5.setClassLoader(r6)     // Catch: java.lang.Throwable -> Ld7
            java.lang.String r6 = "status"
            int r6 = r5.getInt(r6)     // Catch: java.lang.Throwable -> Ld7
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> Ld7
            if (r6 != 0) goto Lc7
            java.lang.String r7 = "result"
            android.os.Parcelable r5 = r5.getParcelable(r7)     // Catch: java.lang.Throwable -> Ld7
            com.baidu.liantian.core.c r5 = (com.baidu.liantian.core.c) r5     // Catch: java.lang.Throwable -> Ld7
            goto Lc8
        Lc7:
            r5 = r1
        Lc8:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> Ld7
            if (r5 != 0) goto Ld0
            r5 = r1
            goto Ld2
        Ld0:
            java.lang.Object r5 = r5.f5950f     // Catch: java.lang.Throwable -> Ld7
        Ld2:
            android.util.Pair r5 = android.util.Pair.create(r6, r5)     // Catch: java.lang.Throwable -> Ld7
            return r5
        Ld7:
            com.baidu.liantian.b.e.a()
            android.util.Pair r5 = android.util.Pair.create(r0, r1)
            return r5
    }

    private static android.util.Pair<java.lang.Integer, java.lang.Object> a(android.content.Context r6, int r7, java.lang.String r8, java.lang.Class<?>[] r9, java.lang.Object... r10) {
            r2 = 1
            r0 = r6
            r1 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            android.util.Pair r6 = a(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public static java.lang.String a(android.content.Context r5) {
            java.lang.String r0 = ""
            r1 = 0
            boolean r2 = com.baidu.liantian.b.e.a(r5, r1)     // Catch: java.lang.Throwable -> L59
            if (r2 != 0) goto Ld
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L59
            return r0
        Ld:
            java.lang.String r2 = com.baidu.liantian.b.e.b(r5)     // Catch: java.lang.Throwable -> L59
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L59
            if (r3 == 0) goto L2a
            java.lang.String r1 = r5.getPackageName()     // Catch: java.lang.Throwable -> L59
            boolean r1 = com.baidu.liantian.b.e.b(r1)     // Catch: java.lang.Throwable -> L59
            if (r1 == 0) goto L22
            return r0
        L22:
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L59
            java.lang.String r5 = b(r5)     // Catch: java.lang.Throwable -> L59
            return r5
        L2a:
            boolean r2 = com.baidu.liantian.b.e.b(r2)     // Catch: java.lang.Throwable -> L59
            if (r2 == 0) goto L51
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L59
            java.lang.String r2 = "gz"
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L59
            r4 = 0
            android.util.Pair r5 = a(r5, r1, r2, r4, r3)     // Catch: java.lang.Throwable -> L59
            if (r5 == 0) goto L5c
            java.lang.Object r1 = r5.first     // Catch: java.lang.Throwable -> L59
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L59
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L59
            if (r1 != 0) goto L4d
            java.lang.Object r5 = r5.second     // Catch: java.lang.Throwable -> L59
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L59
            return r5
        L4d:
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L59
            return r0
        L51:
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L59
            java.lang.String r5 = b(r5)     // Catch: java.lang.Throwable -> L59
            return r5
        L59:
            com.baidu.liantian.b.e.a()
        L5c:
            return r0
    }

    public static void a(android.content.Context r1, int r2, boolean r3) {
            com.baidu.liantian.core.d.f5952c = r3     // Catch: java.lang.Throwable -> L16
            com.baidu.liantian.b.e.l(r1)     // Catch: java.lang.Throwable -> L16
            if (r3 != 0) goto L8
            return
        L8:
            java.lang.Thread r3 = new java.lang.Thread     // Catch: java.lang.Throwable -> L16
            com.baidu.liantian.core.e$1 r0 = new com.baidu.liantian.core.e$1     // Catch: java.lang.Throwable -> L16
            r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> L16
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L16
            r3.start()     // Catch: java.lang.Throwable -> L16
            return
        L16:
            com.baidu.liantian.b.e.a()
            return
    }

    public static boolean a(int r11, java.lang.String r12, com.baidu.liantian.ac.Callback r13, java.lang.Class<?>[] r14, java.lang.Object... r15) {
            r0 = 0
            android.content.Context r1 = com.baidu.liantian.core.d.f5951b     // Catch: java.lang.Throwable -> Lc2
            r2 = 1
            if (r1 != 0) goto L18
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> Lc2
            if (r13 == 0) goto L17
            r11 = 4
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch: java.lang.Throwable -> Lc2
            java.lang.Object[] r12 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> Lc2
            r12[r0] = r11     // Catch: java.lang.Throwable -> Lc2
            r13.onError(r12)     // Catch: java.lang.Throwable -> Lc2
        L17:
            return r0
        L18:
            boolean r3 = com.baidu.liantian.b.e.a(r1, r0)     // Catch: java.lang.Throwable -> Lc2
            if (r3 != 0) goto L31
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> Lc2
            if (r13 == 0) goto L30
            r11 = 11
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch: java.lang.Throwable -> Lc2
            java.lang.Object[] r12 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> Lc2
            r12[r0] = r11     // Catch: java.lang.Throwable -> Lc2
            r13.onError(r12)     // Catch: java.lang.Throwable -> Lc2
        L30:
            return r0
        L31:
            android.content.Context r3 = com.baidu.liantian.core.d.f5951b     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r3 = com.baidu.liantian.b.e.b(r3)     // Catch: java.lang.Throwable -> Lc2
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> Lc2
            if (r4 == 0) goto L68
            android.content.Context r3 = com.baidu.liantian.core.d.f5951b     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r3 = r3.getPackageName()     // Catch: java.lang.Throwable -> Lc2
            boolean r3 = com.baidu.liantian.b.e.b(r3)     // Catch: java.lang.Throwable -> Lc2
            if (r3 == 0) goto L58
            if (r13 == 0) goto L57
            r11 = 5
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch: java.lang.Throwable -> Lc2
            java.lang.Object[] r12 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> Lc2
            r12[r0] = r11     // Catch: java.lang.Throwable -> Lc2
            r13.onError(r12)     // Catch: java.lang.Throwable -> Lc2
        L57:
            return r0
        L58:
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> Lc2
            com.baidu.liantian.core.d r3 = com.baidu.liantian.core.d.a(r1)     // Catch: java.lang.Throwable -> Lc2
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r8 = r15
            r3.a(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> Lc2
            return r2
        L68:
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r8 = r15
            boolean r11 = com.baidu.liantian.b.e.b(r3)     // Catch: java.lang.Throwable -> Lc2
            if (r11 == 0) goto Laf
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> Lc2
            r9 = r8
            r8 = r5
            r5 = r6
            android.content.Context r6 = com.baidu.liantian.core.d.f5951b     // Catch: java.lang.Throwable -> Lc2
            boolean r11 = android.text.TextUtils.isEmpty(r8)     // Catch: java.lang.Throwable -> L8f
            if (r11 == 0) goto L91
            if (r5 == 0) goto Lae
            java.lang.Integer r11 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L8f
            java.lang.Object[] r12 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L8f
            r12[r0] = r11     // Catch: java.lang.Throwable -> L8f
            r5.onError(r12)     // Catch: java.lang.Throwable -> L8f
            goto Lae
        L8f:
            goto L9d
        L91:
            r10 = r9
            r9 = r7
            r7 = r4
            com.baidu.liantian.core.e$3 r4 = new com.baidu.liantian.core.e$3     // Catch: java.lang.Throwable -> L8f
            r4.<init>(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L8f
            r4.start()     // Catch: java.lang.Throwable -> L8f
            goto Lae
        L9d:
            if (r5 == 0) goto Lab
            r11 = 3
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch: java.lang.Throwable -> Lab
            java.lang.Object[] r12 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> Lab
            r12[r0] = r11     // Catch: java.lang.Throwable -> Lab
            r5.onError(r12)     // Catch: java.lang.Throwable -> Lab
        Lab:
            com.baidu.liantian.b.e.a()     // Catch: java.lang.Throwable -> Lc2
        Lae:
            return r2
        Laf:
            r9 = r8
            r8 = r5
            r5 = r6
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> Lc2
            com.baidu.liantian.core.d r11 = com.baidu.liantian.core.d.a(r1)     // Catch: java.lang.Throwable -> Lc2
            r6 = r8
            r8 = r7
            r7 = r5
            r5 = r4
            r4 = r11
            r4.a(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> Lc2
            return r2
        Lc2:
            com.baidu.liantian.b.e.a()
            return r0
    }

    private static java.lang.String b(android.content.Context r7) {
            java.lang.String r0 = "74FFB5E615AA72E0B057EE43E3D5A23A|440049145074113"
            java.lang.String r1 = "xytk"
            com.baidu.liantian.e r2 = new com.baidu.liantian.e     // Catch: java.lang.Throwable -> L78
            r2.<init>(r7)     // Catch: java.lang.Throwable -> L78
            android.content.SharedPreferences r3 = r2.f5991b     // Catch: java.lang.Throwable -> L78
            java.lang.String r4 = ""
            java.lang.String r3 = r3.getString(r1, r4)     // Catch: java.lang.Throwable -> L78
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L78
            if (r4 != 0) goto L18
            return r3
        L18:
            java.lang.String r7 = com.baidu.liantian.b.g.a(r7)     // Catch: java.lang.Throwable -> L78
            boolean r3 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> L78
            if (r3 != 0) goto L7b
            java.lang.String r3 = "\\|"
            java.lang.String[] r7 = r7.split(r3)     // Catch: java.lang.Throwable -> L78
            if (r7 == 0) goto L77
            int r3 = r7.length     // Catch: java.lang.Throwable -> L78
            r4 = 2
            if (r3 != r4) goto L77
            r3 = 0
            r4 = r7[r3]     // Catch: java.lang.Throwable -> L78
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L78
            if (r4 != 0) goto L77
            r4 = 1
            r5 = r7[r4]     // Catch: java.lang.Throwable -> L78
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L78
            if (r5 == 0) goto L41
            goto L77
        L41:
            com.baidu.liantian.ac.F r5 = com.baidu.liantian.ac.F.getInstance()     // Catch: java.lang.Throwable -> L78
            r4 = r7[r4]     // Catch: java.lang.Throwable -> L78
            byte[] r4 = r4.getBytes()     // Catch: java.lang.Throwable -> L78
            r6 = r7[r3]     // Catch: java.lang.Throwable -> L78
            byte[] r6 = r6.getBytes()     // Catch: java.lang.Throwable -> L78
            byte[] r4 = r5.re(r4, r6)     // Catch: java.lang.Throwable -> L78
            if (r4 == 0) goto L7b
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L78
            r5.<init>()     // Catch: java.lang.Throwable -> L78
            r7 = r7[r3]     // Catch: java.lang.Throwable -> L78
            r5.append(r7)     // Catch: java.lang.Throwable -> L78
            java.lang.String r7 = com.baidu.liantian.b.e.a(r4)     // Catch: java.lang.Throwable -> L78
            r5.append(r7)     // Catch: java.lang.Throwable -> L78
            java.lang.String r7 = r5.toString()     // Catch: java.lang.Throwable -> L78
            android.content.SharedPreferences$Editor r3 = r2.f5993d     // Catch: java.lang.Throwable -> L78
            r3.putString(r1, r7)     // Catch: java.lang.Throwable -> L78
            android.content.SharedPreferences$Editor r1 = r2.f5993d     // Catch: java.lang.Throwable -> L78
            r1.commit()     // Catch: java.lang.Throwable -> L78
            return r7
        L77:
            return r0
        L78:
            com.baidu.liantian.b.e.a()
        L7b:
            return r0
    }
}
