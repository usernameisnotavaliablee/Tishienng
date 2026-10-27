package androidx.core.graphics;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class BitmapCompat {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(27)
    static class Api27Impl {
        private Api27Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        static android.graphics.Bitmap copyBitmapIfHardware(android.graphics.Bitmap r3) {
                android.graphics.Bitmap$Config r0 = r3.getConfig()
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.HARDWARE
                if (r0 != r1) goto L19
                android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
                int r1 = android.os.Build.VERSION.SDK_INT
                r2 = 31
                if (r1 < r2) goto L14
                android.graphics.Bitmap$Config r0 = androidx.core.graphics.BitmapCompat.Api31Impl.getHardwareBitmapConfig(r3)
            L14:
                r1 = 1
                android.graphics.Bitmap r3 = r3.copy(r0, r1)
            L19:
                return r3
        }

        @androidx.annotation.DoNotInline
        static android.graphics.Bitmap createBitmapWithSourceColorspace(int r3, int r4, android.graphics.Bitmap r5, boolean r6) {
                android.graphics.Bitmap$Config r0 = r5.getConfig()
                android.graphics.ColorSpace r1 = r5.getColorSpace()
                android.graphics.ColorSpace$Named r2 = android.graphics.ColorSpace.Named.LINEAR_EXTENDED_SRGB
                android.graphics.ColorSpace r2 = android.graphics.ColorSpace.get(r2)
                if (r6 == 0) goto L1e
                android.graphics.ColorSpace r6 = r5.getColorSpace()
                boolean r6 = r6.equals(r2)
                if (r6 != 0) goto L1e
                android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.RGBA_F16
                r1 = r2
                goto L32
            L1e:
                android.graphics.Bitmap$Config r6 = r5.getConfig()
                android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.HARDWARE
                if (r6 != r2) goto L32
                android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
                int r6 = android.os.Build.VERSION.SDK_INT
                r2 = 31
                if (r6 < r2) goto L32
                android.graphics.Bitmap$Config r0 = androidx.core.graphics.BitmapCompat.Api31Impl.getHardwareBitmapConfig(r5)
            L32:
                boolean r5 = r5.hasAlpha()
                android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r3, r4, r0, r5, r1)
                return r3
        }

        @androidx.annotation.DoNotInline
        static boolean isAlreadyF16AndLinear(android.graphics.Bitmap r3) {
                android.graphics.ColorSpace$Named r0 = android.graphics.ColorSpace.Named.LINEAR_EXTENDED_SRGB
                android.graphics.ColorSpace r0 = android.graphics.ColorSpace.get(r0)
                android.graphics.Bitmap$Config r1 = r3.getConfig()
                android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.RGBA_F16
                if (r1 != r2) goto L1a
                android.graphics.ColorSpace r3 = r3.getColorSpace()
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L1a
                r3 = 1
                return r3
            L1a:
                r3 = 0
                return r3
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(29)
    static class Api29Impl {
        private Api29Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        static void setPaintBlendMode(android.graphics.Paint r1) {
                android.graphics.BlendMode r0 = android.graphics.BlendMode.SRC
                r1.setBlendMode(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(31)
    static class Api31Impl {
        private Api31Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        static android.graphics.Bitmap.Config getHardwareBitmapConfig(android.graphics.Bitmap r1) {
                android.hardware.HardwareBuffer r1 = r1.getHardwareBuffer()
                int r1 = r1.getFormat()
                r0 = 22
                if (r1 != r0) goto Lf
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGBA_F16
                return r1
            Lf:
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888
                return r1
        }
    }

    private BitmapCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    public static android.graphics.Bitmap createScaledBitmap(@androidx.annotation.NonNull android.graphics.Bitmap r20, int r21, int r22, @androidx.annotation.Nullable android.graphics.Rect r23, boolean r24) {
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r23
            if (r1 <= 0) goto L204
            if (r2 <= 0) goto L204
            if (r3 == 0) goto L35
            boolean r4 = r3.isEmpty()
            if (r4 != 0) goto L2d
            int r4 = r3.left
            if (r4 < 0) goto L2d
            int r4 = r3.right
            int r5 = r0.getWidth()
            if (r4 > r5) goto L2d
            int r4 = r3.top
            if (r4 < 0) goto L2d
            int r4 = r3.bottom
            int r5 = r0.getHeight()
            if (r4 > r5) goto L2d
            goto L35
        L2d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "srcRect must be contained by srcBm!"
            r0.<init>(r1)
            throw r0
        L35:
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 27
            if (r4 < r5) goto L40
            android.graphics.Bitmap r6 = androidx.core.graphics.BitmapCompat.Api27Impl.copyBitmapIfHardware(r0)
            goto L41
        L40:
            r6 = r0
        L41:
            if (r3 == 0) goto L48
            int r7 = r3.width()
            goto L4c
        L48:
            int r7 = r0.getWidth()
        L4c:
            if (r3 == 0) goto L53
            int r8 = r3.height()
            goto L57
        L53:
            int r8 = r0.getHeight()
        L57:
            float r9 = (float) r1
            float r10 = (float) r7
            float r9 = r9 / r10
            float r10 = (float) r2
            float r11 = (float) r8
            float r10 = r10 / r11
            if (r3 == 0) goto L62
            int r12 = r3.left
            goto L63
        L62:
            r12 = 0
        L63:
            if (r3 == 0) goto L68
            int r3 = r3.top
            goto L69
        L68:
            r3 = 0
        L69:
            r13 = 1
            if (r12 != 0) goto L8c
            if (r3 != 0) goto L8c
            int r14 = r0.getWidth()
            if (r1 != r14) goto L8c
            int r14 = r0.getHeight()
            if (r2 != r14) goto L8c
            boolean r1 = r0.isMutable()
            if (r1 == 0) goto L8b
            if (r0 != r6) goto L8b
            android.graphics.Bitmap$Config r1 = r0.getConfig()
            android.graphics.Bitmap r0 = r0.copy(r1, r13)
            return r0
        L8b:
            return r6
        L8c:
            android.graphics.Paint r14 = new android.graphics.Paint
            r14.<init>(r13)
            r14.setFilterBitmap(r13)
            r15 = 29
            if (r4 < r15) goto L9c
            androidx.core.graphics.BitmapCompat.Api29Impl.setPaintBlendMode(r14)
            goto La6
        L9c:
            android.graphics.PorterDuffXfermode r15 = new android.graphics.PorterDuffXfermode
            android.graphics.PorterDuff$Mode r11 = android.graphics.PorterDuff.Mode.SRC
            r15.<init>(r11)
            r14.setXfermode(r15)
        La6:
            if (r7 != r1) goto Lbf
            if (r8 != r2) goto Lbf
            android.graphics.Bitmap$Config r0 = r6.getConfig()
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r1, r2, r0)
            android.graphics.Canvas r1 = new android.graphics.Canvas
            r1.<init>(r0)
            int r2 = -r12
            float r2 = (float) r2
            int r3 = -r3
            float r3 = (float) r3
            r1.drawBitmap(r6, r2, r3, r14)
            return r0
        Lbf:
            r16 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r16 = java.lang.Math.log(r16)
            r11 = 1065353216(0x3f800000, float:1.0)
            int r15 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r15 <= 0) goto Ldb
            r15 = r12
            r23 = 1065353216(0x3f800000, float:1.0)
            double r11 = (double) r9
            double r11 = java.lang.Math.log(r11)
            double r11 = r11 / r16
            double r11 = java.lang.Math.ceil(r11)
        Ld9:
            int r9 = (int) r11
            goto Lea
        Ldb:
            r15 = r12
            r23 = 1065353216(0x3f800000, float:1.0)
            double r11 = (double) r9
            double r11 = java.lang.Math.log(r11)
            double r11 = r11 / r16
            double r11 = java.lang.Math.floor(r11)
            goto Ld9
        Lea:
            int r11 = (r10 > r23 ? 1 : (r10 == r23 ? 0 : -1))
            if (r11 <= 0) goto Lfb
            double r10 = (double) r10
            double r10 = java.lang.Math.log(r10)
            double r10 = r10 / r16
            double r10 = java.lang.Math.ceil(r10)
        Lf9:
            int r10 = (int) r10
            goto L107
        Lfb:
            double r10 = (double) r10
            double r10 = java.lang.Math.log(r10)
            double r10 = r10 / r16
            double r10 = java.lang.Math.floor(r10)
            goto Lf9
        L107:
            if (r24 == 0) goto L138
            if (r4 < r5) goto L138
            boolean r4 = androidx.core.graphics.BitmapCompat.Api27Impl.isAlreadyF16AndLinear(r0)
            if (r4 != 0) goto L138
            if (r9 <= 0) goto L118
            int r4 = sizeAtStep(r7, r1, r13, r9)
            goto L119
        L118:
            r4 = r7
        L119:
            if (r10 <= 0) goto L120
            int r11 = sizeAtStep(r8, r2, r13, r10)
            goto L121
        L120:
            r11 = r8
        L121:
            android.graphics.Bitmap r4 = androidx.core.graphics.BitmapCompat.Api27Impl.createBitmapWithSourceColorspace(r4, r11, r0, r13)
            android.graphics.Canvas r11 = new android.graphics.Canvas
            r11.<init>(r4)
            int r12 = -r15
            float r12 = (float) r12
            int r3 = -r3
            float r3 = (float) r3
            r11.drawBitmap(r6, r12, r3, r14)
            r3 = r6
            r6 = r4
            r4 = r3
            r3 = 0
            r11 = 1
            r12 = 0
            goto L13b
        L138:
            r4 = 0
            r12 = r15
            r11 = 0
        L13b:
            android.graphics.Rect r15 = new android.graphics.Rect
            r15.<init>(r12, r3, r7, r8)
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            r12 = r9
            r16 = r10
        L148:
            if (r12 != 0) goto L155
            if (r16 == 0) goto L14d
            goto L155
        L14d:
            if (r4 == r0) goto L154
            if (r4 == 0) goto L154
            r4.recycle()
        L154:
            return r6
        L155:
            if (r12 >= 0) goto L15a
            int r12 = r12 + 1
            goto L15e
        L15a:
            if (r12 <= 0) goto L15e
            int r12 = r12 + (-1)
        L15e:
            if (r16 >= 0) goto L165
            int r16 = r16 + 1
        L162:
            r13 = r16
            goto L16a
        L165:
            if (r16 <= 0) goto L162
            int r16 = r16 + (-1)
            goto L162
        L16a:
            int r5 = sizeAtStep(r7, r1, r12, r9)
            r17 = r11
            int r11 = sizeAtStep(r8, r2, r13, r10)
            r18 = r12
            r12 = 0
            r3.set(r12, r12, r5, r11)
            if (r18 != 0) goto L180
            if (r13 != 0) goto L180
            r5 = 1
            goto L181
        L180:
            r5 = 0
        L181:
            if (r4 == 0) goto L191
            int r11 = r4.getWidth()
            if (r11 != r1) goto L191
            int r11 = r4.getHeight()
            if (r11 != r2) goto L191
            r11 = 1
            goto L192
        L191:
            r11 = 0
        L192:
            if (r4 == 0) goto L1b3
            if (r4 == r0) goto L1b3
            if (r24 == 0) goto L1a7
            int r12 = android.os.Build.VERSION.SDK_INT
            r19 = r5
            r5 = 27
            if (r12 < r5) goto L1a9
            boolean r5 = androidx.core.graphics.BitmapCompat.Api27Impl.isAlreadyF16AndLinear(r4)
            if (r5 == 0) goto L1b5
            goto L1a9
        L1a7:
            r19 = r5
        L1a9:
            if (r19 == 0) goto L1b0
            if (r11 == 0) goto L1b5
            if (r17 == 0) goto L1b0
            goto L1b5
        L1b0:
            r12 = 27
            goto L1eb
        L1b3:
            r19 = r5
        L1b5:
            if (r4 == r0) goto L1bc
            if (r4 == 0) goto L1bc
            r4.recycle()
        L1bc:
            if (r18 <= 0) goto L1c1
            r4 = r17
            goto L1c3
        L1c1:
            r4 = r18
        L1c3:
            int r4 = sizeAtStep(r7, r1, r4, r9)
            if (r13 <= 0) goto L1cc
            r5 = r17
            goto L1cd
        L1cc:
            r5 = r13
        L1cd:
            int r5 = sizeAtStep(r8, r2, r5, r10)
            int r11 = android.os.Build.VERSION.SDK_INT
            r12 = 27
            if (r11 < r12) goto L1e3
            if (r24 == 0) goto L1dd
            if (r19 != 0) goto L1dd
            r11 = 1
            goto L1de
        L1dd:
            r11 = 0
        L1de:
            android.graphics.Bitmap r4 = androidx.core.graphics.BitmapCompat.Api27Impl.createBitmapWithSourceColorspace(r4, r5, r0, r11)
            goto L1eb
        L1e3:
            android.graphics.Bitmap$Config r11 = r6.getConfig()
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r4, r5, r11)
        L1eb:
            android.graphics.Canvas r5 = new android.graphics.Canvas
            r5.<init>(r4)
            r5.drawBitmap(r6, r15, r3, r14)
            r15.set(r3)
            r5 = r6
            r6 = r4
            r4 = r5
            r16 = r13
            r11 = r17
            r12 = r18
            r5 = 27
            r13 = 1
            goto L148
        L204:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "dstW and dstH must be > 0!"
            r0.<init>(r1)
            throw r0
    }

    public static int getAllocationByteCount(@androidx.annotation.NonNull android.graphics.Bitmap r0) {
            int r0 = r0.getAllocationByteCount()
            return r0
    }

    public static boolean hasMipMap(@androidx.annotation.NonNull android.graphics.Bitmap r0) {
            boolean r0 = r0.hasMipMap()
            return r0
    }

    public static void setHasMipMap(@androidx.annotation.NonNull android.graphics.Bitmap r0, boolean r1) {
            r0.setHasMipMap(r1)
            return
    }

    @androidx.annotation.VisibleForTesting
    static int sizeAtStep(int r1, int r2, int r3, int r4) {
            if (r3 != 0) goto L3
            return r2
        L3:
            r0 = 1
            if (r3 <= 0) goto Lc
            int r4 = r4 - r3
            int r2 = r0 << r4
            int r1 = r1 * r2
            return r1
        Lc:
            int r1 = -r3
            int r1 = r1 - r0
            int r1 = r2 << r1
            return r1
    }
}
