package com.umeng.social.tool;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class ComposeTool {
    public static int backgroundColor;
    public static com.umeng.social.tool.ComposeTool.ComposeDirection direction;
    public static int textColor;
    public static int textsize;
    public static android.graphics.Typeface typeface;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum ComposeDirection extends java.lang.Enum<com.umeng.social.tool.ComposeTool.ComposeDirection> {
        private static final /* synthetic */ com.umeng.social.tool.ComposeTool.ComposeDirection[] $VALUES = null;
        public static final com.umeng.social.tool.ComposeTool.ComposeDirection CUSTOM = null;
        public static final com.umeng.social.tool.ComposeTool.ComposeDirection DOWN = null;
        public static final com.umeng.social.tool.ComposeTool.ComposeDirection LEFT = null;
        public static final com.umeng.social.tool.ComposeTool.ComposeDirection LEFTDOWN = null;
        public static final com.umeng.social.tool.ComposeTool.ComposeDirection LEFTUP = null;
        public static final com.umeng.social.tool.ComposeTool.ComposeDirection RIGHT = null;
        public static final com.umeng.social.tool.ComposeTool.ComposeDirection RIGHTDOWN = null;
        public static final com.umeng.social.tool.ComposeTool.ComposeDirection RIGHTUP = null;
        public static final com.umeng.social.tool.ComposeTool.ComposeDirection UP = null;

        static {
                com.umeng.social.tool.ComposeTool$ComposeDirection r0 = new com.umeng.social.tool.ComposeTool$ComposeDirection
                java.lang.String r1 = "UP"
                r2 = 0
                r0.<init>(r1, r2)
                com.umeng.social.tool.ComposeTool.ComposeDirection.UP = r0
                com.umeng.social.tool.ComposeTool$ComposeDirection r1 = new com.umeng.social.tool.ComposeTool$ComposeDirection
                java.lang.String r3 = "DOWN"
                r4 = 1
                r1.<init>(r3, r4)
                com.umeng.social.tool.ComposeTool.ComposeDirection.DOWN = r1
                com.umeng.social.tool.ComposeTool$ComposeDirection r3 = new com.umeng.social.tool.ComposeTool$ComposeDirection
                java.lang.String r5 = "LEFT"
                r6 = 2
                r3.<init>(r5, r6)
                com.umeng.social.tool.ComposeTool.ComposeDirection.LEFT = r3
                com.umeng.social.tool.ComposeTool$ComposeDirection r5 = new com.umeng.social.tool.ComposeTool$ComposeDirection
                java.lang.String r7 = "RIGHT"
                r8 = 3
                r5.<init>(r7, r8)
                com.umeng.social.tool.ComposeTool.ComposeDirection.RIGHT = r5
                com.umeng.social.tool.ComposeTool$ComposeDirection r7 = new com.umeng.social.tool.ComposeTool$ComposeDirection
                java.lang.String r9 = "LEFTUP"
                r10 = 4
                r7.<init>(r9, r10)
                com.umeng.social.tool.ComposeTool.ComposeDirection.LEFTUP = r7
                com.umeng.social.tool.ComposeTool$ComposeDirection r9 = new com.umeng.social.tool.ComposeTool$ComposeDirection
                java.lang.String r11 = "LEFTDOWN"
                r12 = 5
                r9.<init>(r11, r12)
                com.umeng.social.tool.ComposeTool.ComposeDirection.LEFTDOWN = r9
                com.umeng.social.tool.ComposeTool$ComposeDirection r11 = new com.umeng.social.tool.ComposeTool$ComposeDirection
                java.lang.String r13 = "RIGHTUP"
                r14 = 6
                r11.<init>(r13, r14)
                com.umeng.social.tool.ComposeTool.ComposeDirection.RIGHTUP = r11
                com.umeng.social.tool.ComposeTool$ComposeDirection r13 = new com.umeng.social.tool.ComposeTool$ComposeDirection
                java.lang.String r15 = "RIGHTDOWN"
                r16 = 0
                r2 = 7
                r13.<init>(r15, r2)
                com.umeng.social.tool.ComposeTool.ComposeDirection.RIGHTDOWN = r13
                com.umeng.social.tool.ComposeTool$ComposeDirection r15 = new com.umeng.social.tool.ComposeTool$ComposeDirection
                r17 = 7
                java.lang.String r2 = "CUSTOM"
                r18 = 1
                r4 = 8
                r15.<init>(r2, r4)
                com.umeng.social.tool.ComposeTool.ComposeDirection.CUSTOM = r15
                r2 = 9
                com.umeng.social.tool.ComposeTool$ComposeDirection[] r2 = new com.umeng.social.tool.ComposeTool.ComposeDirection[r2]
                r2[r16] = r0
                r2[r18] = r1
                r2[r6] = r3
                r2[r8] = r5
                r2[r10] = r7
                r2[r12] = r9
                r2[r14] = r11
                r2[r17] = r13
                r2[r4] = r15
                com.umeng.social.tool.ComposeTool.ComposeDirection.$VALUES = r2
                return
        }

        ComposeDirection(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.umeng.social.tool.ComposeTool.ComposeDirection valueOf(java.lang.String r1) {
                java.lang.Class<com.umeng.social.tool.ComposeTool$ComposeDirection> r0 = com.umeng.social.tool.ComposeTool.ComposeDirection.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.umeng.social.tool.ComposeTool$ComposeDirection r1 = (com.umeng.social.tool.ComposeTool.ComposeDirection) r1
                return r1
        }

        public static com.umeng.social.tool.ComposeTool.ComposeDirection[] values() {
                com.umeng.social.tool.ComposeTool$ComposeDirection[] r0 = com.umeng.social.tool.ComposeTool.ComposeDirection.$VALUES
                java.lang.Object r0 = r0.clone()
                com.umeng.social.tool.ComposeTool$ComposeDirection[] r0 = (com.umeng.social.tool.ComposeTool.ComposeDirection[]) r0
                return r0
        }
    }

    static {
            com.umeng.social.tool.ComposeTool$ComposeDirection r0 = com.umeng.social.tool.ComposeTool.ComposeDirection.CUSTOM
            com.umeng.social.tool.ComposeTool.direction = r0
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            com.umeng.social.tool.ComposeTool.textColor = r0
            r0 = 18
            com.umeng.social.tool.ComposeTool.textsize = r0
            r0 = -1
            com.umeng.social.tool.ComposeTool.backgroundColor = r0
            android.graphics.Typeface r0 = android.graphics.Typeface.DEFAULT
            com.umeng.social.tool.ComposeTool.typeface = r0
            return
    }

    public ComposeTool() {
            r0 = this;
            r0.<init>()
            return
    }

    public static android.graphics.Bitmap createCompose(android.graphics.Bitmap r6, android.graphics.Bitmap r7, boolean r8, int r9) {
            r0 = 0
            if (r6 != 0) goto L4
            return r0
        L4:
            if (r7 != 0) goto L7
            return r0
        L7:
            int r1 = r6.getWidth()
            int r2 = r6.getHeight()
            int r3 = r7.getWidth()
            int r4 = r7.getHeight()
            if (r8 == 0) goto L1e
            int r3 = java.lang.Math.max(r1, r3)
            goto L20
        L1e:
            int r3 = r3 + r1
            int r3 = r3 + r9
        L20:
            if (r8 == 0) goto L25
            int r4 = r4 + r2
            int r4 = r4 + r9
            goto L29
        L25:
            int r4 = java.lang.Math.max(r2, r4)
        L29:
            android.graphics.Bitmap$Config r5 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r3, r4, r5)
            android.graphics.Canvas r4 = new android.graphics.Canvas
            r4.<init>(r3)
            r5 = 0
            r4.drawBitmap(r6, r5, r5, r0)
            if (r8 == 0) goto L40
            int r2 = r2 + r9
            float r6 = (float) r2
            r4.drawBitmap(r7, r5, r6, r0)
            return r3
        L40:
            int r1 = r1 + r9
            float r6 = (float) r1
            r4.drawBitmap(r7, r6, r5, r0)
            return r3
    }

    public static android.graphics.Bitmap createTextImage(java.lang.String r11, android.graphics.Bitmap r12, int r13, int r14) {
            android.graphics.Bitmap$Config r0 = r12.getConfig()
            int r4 = r12.getWidth()
            int r9 = r12.getHeight()
            if (r0 != 0) goto L10
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
        L10:
            android.text.TextPaint r3 = new android.text.TextPaint
            r10 = 1
            r3.<init>(r10)
            int r1 = com.umeng.social.tool.ComposeTool.textColor
            r3.setColor(r1)
            int r1 = com.umeng.social.tool.ComposeTool.textsize
            float r1 = (float) r1
            r3.setTextSize(r1)
            r3.setDither(r10)
            r3.setFilterBitmap(r10)
            android.graphics.Typeface r1 = com.umeng.social.tool.ComposeTool.typeface
            r3.setTypeface(r1)
            android.text.StaticLayout r1 = new android.text.StaticLayout
            android.text.Layout$Alignment r5 = android.text.Layout.Alignment.ALIGN_NORMAL
            r7 = 0
            r8 = 1
            r6 = 1065353216(0x3f800000, float:1.0)
            r2 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            android.graphics.Rect r11 = new android.graphics.Rect
            r11.<init>()
            r5 = 0
            int r6 = r2.length()
            r3.getTextBounds(r2, r5, r6, r11)
            android.graphics.Bitmap r11 = r12.copy(r0, r10)
            int r12 = r13 * 2
            int r4 = r4 + r12
            int r12 = r1.getHeight()
            int r9 = r9 + r12
            int r12 = r14 * 4
            int r9 = r9 + r12
            android.graphics.Bitmap$Config r12 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r12 = android.graphics.Bitmap.createBitmap(r4, r9, r12)
            android.graphics.Canvas r0 = new android.graphics.Canvas
            r0.<init>(r12)
            int r2 = com.umeng.social.tool.ComposeTool.backgroundColor
            r0.drawColor(r2)
            float r13 = (float) r13
            int r2 = r1.getHeight()
            int r3 = r14 * 3
            int r2 = r2 + r3
            float r2 = (float) r2
            r3 = 0
            r0.drawBitmap(r11, r13, r2, r3)
            float r11 = (float) r14
            r0.translate(r13, r11)
            r1.draw(r0)
            return r12
    }

    public static android.graphics.Bitmap createWaterMask(android.graphics.Bitmap r11, android.graphics.Bitmap r12, int r13, int r14) {
            r0 = 0
            if (r11 != 0) goto L4
            return r0
        L4:
            int r1 = r11.getWidth()
            int r2 = r11.getHeight()
            int r3 = r12.getWidth()
            int r4 = r12.getHeight()
            int r5 = r1 / 2
            int r6 = r3 / 2
            int r5 = r5 - r6
            int r6 = r2 / 2
            int r7 = r4 / 2
            int r6 = r6 - r7
            android.graphics.Bitmap$Config r7 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r7 = android.graphics.Bitmap.createBitmap(r1, r2, r7)
            android.graphics.Canvas r8 = new android.graphics.Canvas
            r8.<init>(r7)
            r9 = 0
            r8.drawBitmap(r11, r9, r9, r0)
            com.umeng.social.tool.ComposeTool$ComposeDirection r11 = com.umeng.social.tool.ComposeTool.direction
            com.umeng.social.tool.ComposeTool$ComposeDirection r10 = com.umeng.social.tool.ComposeTool.ComposeDirection.CUSTOM
            if (r11 != r10) goto L39
            float r11 = (float) r13
            float r13 = (float) r14
            r8.drawBitmap(r12, r11, r13, r0)
            return r7
        L39:
            com.umeng.social.tool.ComposeTool$ComposeDirection r11 = com.umeng.social.tool.ComposeTool.direction
            com.umeng.social.tool.ComposeTool$ComposeDirection r13 = com.umeng.social.tool.ComposeTool.ComposeDirection.UP
            if (r11 != r13) goto L44
            float r11 = (float) r5
            r8.drawBitmap(r12, r11, r9, r0)
            return r7
        L44:
            com.umeng.social.tool.ComposeTool$ComposeDirection r11 = com.umeng.social.tool.ComposeTool.direction
            com.umeng.social.tool.ComposeTool$ComposeDirection r13 = com.umeng.social.tool.ComposeTool.ComposeDirection.DOWN
            if (r11 != r13) goto L51
            float r11 = (float) r5
            int r2 = r2 - r4
            float r13 = (float) r2
            r8.drawBitmap(r12, r11, r13, r0)
            return r7
        L51:
            com.umeng.social.tool.ComposeTool$ComposeDirection r11 = com.umeng.social.tool.ComposeTool.direction
            com.umeng.social.tool.ComposeTool$ComposeDirection r13 = com.umeng.social.tool.ComposeTool.ComposeDirection.LEFT
            if (r11 != r13) goto L5c
            float r11 = (float) r6
            r8.drawBitmap(r12, r9, r11, r0)
            return r7
        L5c:
            com.umeng.social.tool.ComposeTool$ComposeDirection r11 = com.umeng.social.tool.ComposeTool.direction
            com.umeng.social.tool.ComposeTool$ComposeDirection r13 = com.umeng.social.tool.ComposeTool.ComposeDirection.RIGHT
            if (r11 != r13) goto L69
            int r1 = r1 - r3
            float r11 = (float) r1
            float r13 = (float) r6
            r8.drawBitmap(r12, r11, r13, r0)
            return r7
        L69:
            com.umeng.social.tool.ComposeTool$ComposeDirection r11 = com.umeng.social.tool.ComposeTool.direction
            com.umeng.social.tool.ComposeTool$ComposeDirection r13 = com.umeng.social.tool.ComposeTool.ComposeDirection.LEFTUP
            if (r11 != r13) goto L73
            r8.drawBitmap(r12, r9, r9, r0)
            return r7
        L73:
            com.umeng.social.tool.ComposeTool$ComposeDirection r11 = com.umeng.social.tool.ComposeTool.direction
            com.umeng.social.tool.ComposeTool$ComposeDirection r13 = com.umeng.social.tool.ComposeTool.ComposeDirection.LEFTDOWN
            if (r11 != r13) goto L7f
            int r2 = r2 - r4
            float r11 = (float) r2
            r8.drawBitmap(r12, r9, r11, r0)
            return r7
        L7f:
            com.umeng.social.tool.ComposeTool$ComposeDirection r11 = com.umeng.social.tool.ComposeTool.direction
            com.umeng.social.tool.ComposeTool$ComposeDirection r13 = com.umeng.social.tool.ComposeTool.ComposeDirection.RIGHTUP
            if (r11 != r13) goto L8b
            int r1 = r1 - r3
            float r11 = (float) r1
            r8.drawBitmap(r12, r11, r9, r0)
            return r7
        L8b:
            com.umeng.social.tool.ComposeTool$ComposeDirection r11 = com.umeng.social.tool.ComposeTool.direction
            com.umeng.social.tool.ComposeTool$ComposeDirection r13 = com.umeng.social.tool.ComposeTool.ComposeDirection.RIGHTDOWN
            if (r11 != r13) goto L98
            int r1 = r1 - r3
            float r11 = (float) r1
            int r2 = r2 - r4
            float r13 = (float) r2
            r8.drawBitmap(r12, r11, r13, r0)
        L98:
            return r7
    }
}
