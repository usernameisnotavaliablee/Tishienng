package com.autonavi.base.ae.gmap.glyph;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class GlyphLoader {
    private static java.util.Map<java.lang.String, android.graphics.Typeface> FontFaceMap;

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.autonavi.base.ae.gmap.glyph.GlyphLoader.FontFaceMap = r0
            return
    }

    public GlyphLoader() {
            r0 = this;
            r0.<init>()
            return
    }

    public static long createGlyphLoader() {
            long r0 = nativeCreateGlyphLoader()
            return r0
    }

    private static java.lang.String decodeUnicode(java.lang.String r1) {
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            return r1
    }

    private static java.lang.String decodeUnicode(short r1) {
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            char r1 = (char) r1
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            return r1
    }

    public static void destroyGlyphLoader(long r0) {
            nativeDestroyGlyphLoader(r0)
            return
    }

    private static com.autonavi.base.ae.gmap.glyph.FontMetricsRequestParam genFontMetricsParam(byte[] r5) {
            com.autonavi.base.ae.gmap.glyph.FontMetricsRequestParam r0 = new com.autonavi.base.ae.gmap.glyph.FontMetricsRequestParam
            r0.<init>()
            r1 = 0
            int r1 = com.autonavi.base.amap.mapcore.tools.GLConvertUtil.getInt(r5, r1)
            float r1 = (float) r1
            r2 = 981668463(0x3a83126f, float:0.001)
            float r1 = r1 * r2
            r0.fFontSize = r1
            r1 = 4
            int r2 = com.autonavi.base.amap.mapcore.tools.GLConvertUtil.getInt(r5, r1)
            r0.nFontStyleCode = r2
            r2 = 8
            int r2 = com.autonavi.base.amap.mapcore.tools.GLConvertUtil.getInt(r5, r2)
            r3 = 1
            r4 = 12
            if (r3 != r2) goto L32
            int r2 = com.autonavi.base.amap.mapcore.tools.GLConvertUtil.getInt(r5, r4)
            java.lang.String r3 = new java.lang.String
            r4 = 16
            r3.<init>(r5, r4, r2)
            r0.strName = r3
            int r4 = r4 + r2
        L32:
            int r2 = com.autonavi.base.amap.mapcore.tools.GLConvertUtil.getInt(r5, r4)
            int r4 = r4 + r1
            java.lang.String r1 = new java.lang.String
            r1.<init>(r5, r4, r2)
            r0.languageArr = r1
            return r0
    }

    private static com.autonavi.base.ae.gmap.glyph.GlyphRequestParam genGlyphRequestParam(byte[] r7) {
            com.autonavi.base.ae.gmap.glyph.GlyphRequestParam r0 = new com.autonavi.base.ae.gmap.glyph.GlyphRequestParam
            r0.<init>()
            r1 = 0
            int r1 = com.autonavi.base.amap.mapcore.tools.GLConvertUtil.getInt(r7, r1)
            java.lang.String r2 = new java.lang.String
            r3 = 4
            r2.<init>(r7, r3, r1)
            r0.strBuffer = r2
            int r2 = r1 + 4
            com.autonavi.base.ae.gmap.glyph.Font r3 = new com.autonavi.base.ae.gmap.glyph.Font
            r3.<init>()
            int r2 = com.autonavi.base.amap.mapcore.tools.GLConvertUtil.getInt(r7, r2)
            r3.nFontStyleCode = r2
            int r2 = r1 + 8
            int r2 = com.autonavi.base.amap.mapcore.tools.GLConvertUtil.getInt(r7, r2)
            r3.nFontSize = r2
            int r2 = r1 + 12
            int r2 = com.autonavi.base.amap.mapcore.tools.GLConvertUtil.getInt(r7, r2)
            int r1 = r1 + 16
            java.lang.String r4 = new java.lang.String
            r4.<init>(r7, r1, r2)
            r3.strName = r4
            int r1 = r1 + r2
            com.autonavi.base.ae.gmap.glyph.FontMetrics r2 = new com.autonavi.base.ae.gmap.glyph.FontMetrics
            r2.<init>()
            int r4 = com.autonavi.base.amap.mapcore.tools.GLConvertUtil.getInt(r7, r1)
            int r5 = r1 + 4
            float r4 = (float) r4
            r6 = 981668463(0x3a83126f, float:0.001)
            float r4 = r4 * r6
            r2.fAscent = r4
            int r4 = com.autonavi.base.amap.mapcore.tools.GLConvertUtil.getInt(r7, r5)
            int r5 = r1 + 8
            float r4 = (float) r4
            float r4 = r4 * r6
            r2.fDescent = r4
            int r4 = com.autonavi.base.amap.mapcore.tools.GLConvertUtil.getInt(r7, r5)
            int r5 = r1 + 12
            float r4 = (float) r4
            float r4 = r4 * r6
            r2.fLeading = r4
            int r4 = com.autonavi.base.amap.mapcore.tools.GLConvertUtil.getInt(r7, r5)
            int r5 = r1 + 16
            float r4 = (float) r4
            float r4 = r4 * r6
            r2.fHeight = r4
            r3.fontMetrics = r2
            r0.font = r3
            int r2 = com.autonavi.base.amap.mapcore.tools.GLConvertUtil.getInt(r7, r5)
            r0.drawingMode = r2
            int r2 = r1 + 20
            int r2 = com.autonavi.base.amap.mapcore.tools.GLConvertUtil.getInt(r7, r2)
            int r3 = r1 + 24
            float r2 = (float) r2
            float r2 = r2 * r6
            r0.strokeWidth = r2
            int r2 = com.autonavi.base.amap.mapcore.tools.GLConvertUtil.getInt(r7, r3)
            int r3 = r1 + 28
            java.lang.String r4 = new java.lang.String
            r4.<init>(r7, r3, r2)
            r0.languageArr = r4
            int r2 = com.autonavi.base.amap.mapcore.tools.GLConvertUtil.getInt(r7, r3)
            r0.isEmoji = r2
            int r2 = r1 + 32
            int r2 = com.autonavi.base.amap.mapcore.tools.GLConvertUtil.getInt(r7, r2)
            r0.isSDF = r2
            int r2 = r1 + 36
            int r2 = com.autonavi.base.amap.mapcore.tools.GLConvertUtil.getInt(r7, r2)
            int r3 = r1 + 40
            r4 = 1
            if (r4 != r2) goto Lde
            com.autonavi.base.ae.gmap.glyph.GlyphMetrics r2 = new com.autonavi.base.ae.gmap.glyph.GlyphMetrics
            r2.<init>()
            int r3 = com.autonavi.base.amap.mapcore.tools.GLConvertUtil.getInt(r7, r3)
            r2.nWidth = r3
            int r3 = r1 + 44
            int r3 = com.autonavi.base.amap.mapcore.tools.GLConvertUtil.getInt(r7, r3)
            r2.nHeight = r3
            int r3 = r1 + 48
            int r3 = com.autonavi.base.amap.mapcore.tools.GLConvertUtil.getInt(r7, r3)
            int r4 = r1 + 52
            float r3 = (float) r3
            float r3 = r3 * r6
            r2.fLeft = r3
            int r3 = com.autonavi.base.amap.mapcore.tools.GLConvertUtil.getInt(r7, r4)
            int r1 = r1 + 56
            float r3 = (float) r3
            float r3 = r3 * r6
            r2.fTop = r3
            int r7 = com.autonavi.base.amap.mapcore.tools.GLConvertUtil.getInt(r7, r1)
            float r7 = (float) r7
            float r7 = r7 * r6
            r2.fAdvance = r7
            r0.fGlyphMetrics = r2
        Lde:
            return r0
    }

    private static com.autonavi.base.ae.gmap.glyph.FontMetrics getFontMetrics(byte[] r4) {
            com.autonavi.base.ae.gmap.glyph.FontMetricsRequestParam r4 = genFontMetricsParam(r4)
            com.autonavi.base.ae.gmap.glyph.FontStyle r0 = new com.autonavi.base.ae.gmap.glyph.FontStyle
            int r1 = r4.nFontStyleCode
            r0.<init>(r1)
            float r1 = r4.fFontSize
            java.lang.String r4 = r4.strName
            r2 = 0
            r3 = 0
            android.text.TextPaint r4 = newTextPaint(r0, r1, r4, r2, r3)
            android.graphics.Paint$FontMetrics r0 = r4.getFontMetrics()
            com.autonavi.base.ae.gmap.glyph.FontMetrics r1 = new com.autonavi.base.ae.gmap.glyph.FontMetrics
            r1.<init>()
            r2 = 1
            r1.bSuccess = r2
            float r2 = r0.ascent
            float r2 = java.lang.Math.abs(r2)
            r1.fAscent = r2
            float r2 = r0.descent
            float r2 = java.lang.Math.abs(r2)
            r1.fDescent = r2
            float r2 = r0.leading
            float r2 = java.lang.Math.abs(r2)
            r1.fLeading = r2
            float r2 = r0.ascent
            float r2 = java.lang.Math.abs(r2)
            float r0 = r0.descent
            float r0 = java.lang.Math.abs(r0)
            float r2 = r2 + r0
            r1.fHeight = r2
            r0 = 0
            r4.setTypeface(r0)
            return r1
    }

    private static com.autonavi.base.ae.gmap.glyph.GlyphMetrics getGlyphMetrics(byte[] r9) {
            com.autonavi.base.ae.gmap.glyph.GlyphRequestParam r9 = genGlyphRequestParam(r9)
            com.autonavi.base.ae.gmap.glyph.FontStyle r1 = new com.autonavi.base.ae.gmap.glyph.FontStyle
            com.autonavi.base.ae.gmap.glyph.Font r0 = r9.font
            int r0 = r0.nFontStyleCode
            r1.<init>(r0)
            int r0 = r9.drawingMode
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L15
            r4 = 1
            goto L16
        L15:
            r4 = 0
        L16:
            java.lang.String r0 = r9.strBuffer
            com.autonavi.base.ae.gmap.glyph.Font r5 = r9.font
            int r6 = r5.nFontSize
            float r6 = (float) r6
            java.lang.String r5 = r5.strName
            r3 = r5
            r7 = 0
            float r5 = r9.strokeWidth
            int r8 = r9.isEmoji
            r2 = r6
            if (r8 <= 0) goto L2b
            r6 = 1
        L29:
            r8 = 1
            goto L2d
        L2b:
            r6 = 0
            goto L29
        L2d:
            int r9 = r9.isSDF
            if (r9 <= 0) goto L32
            r7 = 1
        L32:
            com.autonavi.base.ae.gmap.glyph.GlyphMetrics r9 = loadGlyphMetrics(r0, r1, r2, r3, r4, r5, r6, r7)
            return r9
    }

    private static com.autonavi.base.ae.gmap.glyph.GlyphRaster getGlyphRaster(byte[] r10) {
            com.autonavi.base.ae.gmap.glyph.GlyphRequestParam r10 = genGlyphRequestParam(r10)
            com.autonavi.base.ae.gmap.glyph.FontStyle r1 = new com.autonavi.base.ae.gmap.glyph.FontStyle
            com.autonavi.base.ae.gmap.glyph.Font r0 = r10.font
            int r0 = r0.nFontStyleCode
            r1.<init>(r0)
            int r0 = r10.drawingMode
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L15
            r4 = 1
            goto L16
        L15:
            r4 = 0
        L16:
            r5 = 3
            if (r0 != r5) goto L30
            java.lang.String r0 = r10.strBuffer
            com.autonavi.base.ae.gmap.glyph.Font r2 = r10.font
            int r3 = r2.nFontSize
            float r3 = (float) r3
            java.lang.String r2 = r2.strName
            float r10 = r10.strokeWidth
            r5 = 1073741824(0x40000000, float:2.0)
            float r5 = r5 * r10
            r9 = r3
            r3 = r2
            r2 = r9
            com.autonavi.base.ae.gmap.glyph.GlyphRaster r10 = loadPathRaster(r0, r1, r2, r3, r4, r5)
            return r10
        L30:
            java.lang.String r0 = r10.strBuffer
            com.autonavi.base.ae.gmap.glyph.Font r5 = r10.font
            int r6 = r5.nFontSize
            float r6 = (float) r6
            java.lang.String r5 = r5.strName
            r3 = r5
            r7 = 0
            float r5 = r10.strokeWidth
            int r8 = r10.isEmoji
            r2 = r6
            if (r8 <= 0) goto L45
            r6 = 1
        L43:
            r8 = 1
            goto L47
        L45:
            r6 = 0
            goto L43
        L47:
            int r10 = r10.isSDF
            if (r10 <= 0) goto L4c
            r7 = 1
        L4c:
            com.autonavi.base.ae.gmap.glyph.GlyphRaster r10 = loadGlyphRaster(r0, r1, r2, r3, r4, r5, r6, r7)
            return r10
    }

    private static com.autonavi.base.ae.gmap.glyph.GlyphMetrics loadGlyphMetrics(java.lang.String r4, com.autonavi.base.ae.gmap.glyph.FontStyle r5, float r6, java.lang.String r7, boolean r8, float r9, boolean r10, boolean r11) {
            com.autonavi.base.ae.gmap.glyph.GlyphMetrics r11 = new com.autonavi.base.ae.gmap.glyph.GlyphMetrics
            r11.<init>()
            if (r5 != 0) goto L8
            goto Le
        L8:
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto Lf
        Le:
            return r11
        Lf:
            r0 = 0
            r1 = 1
            r2 = 0
            if (r10 != 0) goto Lac
            android.text.TextPaint r5 = newTextPaint(r5, r6, r7, r8, r9)     // Catch: java.lang.Exception -> Lba
            android.graphics.Rect r6 = new android.graphics.Rect     // Catch: java.lang.Exception -> Lba
            r6.<init>()     // Catch: java.lang.Exception -> Lba
            int r7 = r4.length()     // Catch: java.lang.Exception -> Lba
            r5.getTextBounds(r4, r2, r7, r6)     // Catch: java.lang.Exception -> Lba
            int r7 = r6.width()     // Catch: java.lang.Exception -> Lba
            if (r7 != 0) goto L55
            int r7 = r6.height()     // Catch: java.lang.Exception -> Lba
            if (r7 != 0) goto L55
            java.lang.String r7 = " "
            float r7 = r5.measureText(r7, r2, r1)     // Catch: java.lang.Exception -> Lba
            android.graphics.Paint$FontMetrics r10 = r5.getFontMetrics()     // Catch: java.lang.Exception -> Lba
            float r10 = r10.ascent     // Catch: java.lang.Exception -> Lba
            float r10 = java.lang.Math.abs(r10)     // Catch: java.lang.Exception -> Lba
            android.graphics.Paint$FontMetrics r3 = r5.getFontMetrics()     // Catch: java.lang.Exception -> Lba
            float r3 = r3.descent     // Catch: java.lang.Exception -> Lba
            float r3 = java.lang.Math.abs(r3)     // Catch: java.lang.Exception -> Lba
            float r10 = r10 + r3
            r6.top = r2     // Catch: java.lang.Exception -> Lba
            r6.left = r2     // Catch: java.lang.Exception -> Lba
            int r7 = (int) r7     // Catch: java.lang.Exception -> Lba
            r6.right = r7     // Catch: java.lang.Exception -> Lba
            int r7 = (int) r10     // Catch: java.lang.Exception -> Lba
            r6.bottom = r7     // Catch: java.lang.Exception -> Lba
        L55:
            if (r8 == 0) goto L7a
            int r7 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r7 <= 0) goto L7a
            r7 = 1073741824(0x40000000, float:2.0)
            float r9 = r9 / r7
            int r7 = r6.top     // Catch: java.lang.Exception -> Lba
            float r7 = (float) r7     // Catch: java.lang.Exception -> Lba
            float r7 = r7 - r9
            int r7 = (int) r7     // Catch: java.lang.Exception -> Lba
            r6.top = r7     // Catch: java.lang.Exception -> Lba
            int r7 = r6.left     // Catch: java.lang.Exception -> Lba
            float r7 = (float) r7     // Catch: java.lang.Exception -> Lba
            float r7 = r7 - r9
            int r7 = (int) r7     // Catch: java.lang.Exception -> Lba
            r6.left = r7     // Catch: java.lang.Exception -> Lba
            int r7 = r6.right     // Catch: java.lang.Exception -> Lba
            float r7 = (float) r7     // Catch: java.lang.Exception -> Lba
            float r7 = r7 + r9
            int r7 = (int) r7     // Catch: java.lang.Exception -> Lba
            r6.right = r7     // Catch: java.lang.Exception -> Lba
            int r7 = r6.bottom     // Catch: java.lang.Exception -> Lba
            float r7 = (float) r7     // Catch: java.lang.Exception -> Lba
            float r7 = r7 + r9
            int r7 = (int) r7     // Catch: java.lang.Exception -> Lba
            r6.bottom = r7     // Catch: java.lang.Exception -> Lba
        L7a:
            r11.bSuccess = r1     // Catch: java.lang.Exception -> Lba
            int r7 = r6.left     // Catch: java.lang.Exception -> Lba
            float r7 = (float) r7     // Catch: java.lang.Exception -> Lba
            r11.fLeft = r7     // Catch: java.lang.Exception -> Lba
            android.graphics.Paint$FontMetrics r7 = r5.getFontMetrics()     // Catch: java.lang.Exception -> Lba
            float r7 = r7.ascent     // Catch: java.lang.Exception -> Lba
            float r7 = java.lang.Math.abs(r7)     // Catch: java.lang.Exception -> Lba
            int r8 = r6.top     // Catch: java.lang.Exception -> Lba
            int r8 = java.lang.Math.abs(r8)     // Catch: java.lang.Exception -> Lba
            float r8 = (float) r8     // Catch: java.lang.Exception -> Lba
            float r7 = r7 - r8
            r11.fTop = r7     // Catch: java.lang.Exception -> Lba
            int r7 = r6.width()     // Catch: java.lang.Exception -> Lba
            r11.nWidth = r7     // Catch: java.lang.Exception -> Lba
            int r6 = r6.height()     // Catch: java.lang.Exception -> Lba
            r11.nHeight = r6     // Catch: java.lang.Exception -> Lba
            float r4 = r5.measureText(r4)     // Catch: java.lang.Exception -> Lba
            r11.fAdvance = r4     // Catch: java.lang.Exception -> Lba
            r4 = 0
            r5.setTypeface(r4)     // Catch: java.lang.Exception -> Lba
            return r11
        Lac:
            r11.bSuccess = r1     // Catch: java.lang.Exception -> Lba
            r11.fLeft = r0     // Catch: java.lang.Exception -> Lba
            r11.fTop = r0     // Catch: java.lang.Exception -> Lba
            int r4 = (int) r6     // Catch: java.lang.Exception -> Lba
            r11.nWidth = r4     // Catch: java.lang.Exception -> Lba
            r11.nHeight = r4     // Catch: java.lang.Exception -> Lba
            r11.fAdvance = r6     // Catch: java.lang.Exception -> Lba
            return r11
        Lba:
            r11.bSuccess = r2
            return r11
    }

    private static com.autonavi.base.ae.gmap.glyph.GlyphRaster loadGlyphRaster(java.lang.String r8, com.autonavi.base.ae.gmap.glyph.FontStyle r9, float r10, java.lang.String r11, boolean r12, float r13, boolean r14, boolean r15) {
            com.autonavi.base.ae.gmap.glyph.GlyphRaster r0 = new com.autonavi.base.ae.gmap.glyph.GlyphRaster
            r0.<init>()
            if (r9 != 0) goto L9
            goto L12e
        L9:
            boolean r1 = android.text.TextUtils.isEmpty(r8)
            if (r1 == 0) goto L11
            goto L12e
        L11:
            r1 = 0
            r2 = 0
            android.content.Context r3 = com.amap.api.col.p0003l.d.f3124f     // Catch: java.lang.Throwable -> L36
            if (r3 == 0) goto L3a
            android.content.Context r3 = r3.getApplicationContext()     // Catch: java.lang.Throwable -> L36
            android.content.Context r3 = com.stub.StubApp.getOrigApplicationContext(r3)     // Catch: java.lang.Throwable -> L36
            java.lang.String r4 = "accessibility"
            java.lang.Object r3 = r3.getSystemService(r4)     // Catch: java.lang.Throwable -> L36
            android.view.accessibility.AccessibilityManager r3 = (android.view.accessibility.AccessibilityManager) r3     // Catch: java.lang.Throwable -> L36
            java.lang.String r4 = "android.view.accessibility.AccessibilityManager"
            java.lang.String r5 = "isHighTextContrastEnabled"
            java.lang.Object r3 = com.autonavi.base.ae.gmap.glyph.ReflectUtil.invoke(r4, r3, r5, r1)     // Catch: java.lang.Throwable -> L36
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> L36
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> L36
            goto L3b
        L36:
            r3 = move-exception
            r3.toString()
        L3a:
            r3 = 0
        L3b:
            android.text.TextPaint r9 = newTextPaint(r9, r10, r11, r12, r13)     // Catch: java.lang.Exception -> L12c
            android.graphics.Rect r10 = new android.graphics.Rect     // Catch: java.lang.Exception -> L12c
            r10.<init>()     // Catch: java.lang.Exception -> L12c
            int r11 = r8.length()     // Catch: java.lang.Exception -> L12c
            r9.getTextBounds(r8, r2, r11, r10)     // Catch: java.lang.Exception -> L12c
            int r11 = r10.width()     // Catch: java.lang.Exception -> L12c
            r4 = 1
            if (r11 != 0) goto L7d
            int r11 = r10.height()     // Catch: java.lang.Exception -> L12c
            if (r11 != 0) goto L7d
            java.lang.String r11 = " "
            float r11 = r9.measureText(r11, r2, r4)     // Catch: java.lang.Exception -> L12c
            android.graphics.Paint$FontMetrics r5 = r9.getFontMetrics()     // Catch: java.lang.Exception -> L12c
            float r5 = r5.ascent     // Catch: java.lang.Exception -> L12c
            float r5 = java.lang.Math.abs(r5)     // Catch: java.lang.Exception -> L12c
            android.graphics.Paint$FontMetrics r6 = r9.getFontMetrics()     // Catch: java.lang.Exception -> L12c
            float r6 = r6.descent     // Catch: java.lang.Exception -> L12c
            float r6 = java.lang.Math.abs(r6)     // Catch: java.lang.Exception -> L12c
            float r5 = r5 + r6
            int r11 = (int) r11     // Catch: java.lang.Exception -> L12c
            r10.right = r11     // Catch: java.lang.Exception -> L12c
            int r11 = (int) r5     // Catch: java.lang.Exception -> L12c
            r10.bottom = r11     // Catch: java.lang.Exception -> L12c
            r10.left = r2     // Catch: java.lang.Exception -> L12c
            r10.top = r2     // Catch: java.lang.Exception -> L12c
        L7d:
            if (r12 == 0) goto La3
            r11 = 0
            int r11 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r11 <= 0) goto La3
            r11 = 1073741824(0x40000000, float:2.0)
            float r13 = r13 / r11
            int r11 = r10.top     // Catch: java.lang.Exception -> L12c
            float r11 = (float) r11     // Catch: java.lang.Exception -> L12c
            float r11 = r11 - r13
            int r11 = (int) r11     // Catch: java.lang.Exception -> L12c
            r10.top = r11     // Catch: java.lang.Exception -> L12c
            int r11 = r10.left     // Catch: java.lang.Exception -> L12c
            float r11 = (float) r11     // Catch: java.lang.Exception -> L12c
            float r11 = r11 - r13
            int r11 = (int) r11     // Catch: java.lang.Exception -> L12c
            r10.left = r11     // Catch: java.lang.Exception -> L12c
            int r11 = r10.right     // Catch: java.lang.Exception -> L12c
            float r11 = (float) r11     // Catch: java.lang.Exception -> L12c
            float r11 = r11 + r13
            int r11 = (int) r11     // Catch: java.lang.Exception -> L12c
            r10.right = r11     // Catch: java.lang.Exception -> L12c
            int r11 = r10.bottom     // Catch: java.lang.Exception -> L12c
            float r11 = (float) r11     // Catch: java.lang.Exception -> L12c
            float r11 = r11 + r13
            int r11 = (int) r11     // Catch: java.lang.Exception -> L12c
            r10.bottom = r11     // Catch: java.lang.Exception -> L12c
        La3:
            boolean r11 = r10.isEmpty()     // Catch: java.lang.Exception -> L12c
            if (r11 != 0) goto L128
            android.graphics.Bitmap$Config r11 = android.graphics.Bitmap.Config.ALPHA_8     // Catch: java.lang.Exception -> L12c
            if (r14 != 0) goto Lb2
            if (r3 == 0) goto Lb0
            goto Lb2
        Lb0:
            r12 = 1
            goto Lb5
        Lb2:
            android.graphics.Bitmap$Config r11 = android.graphics.Bitmap.Config.ARGB_8888     // Catch: java.lang.Exception -> L12c
            r12 = 4
        Lb5:
            if (r15 == 0) goto Lb9
            r13 = 3
            goto Lba
        Lb9:
            r13 = 0
        Lba:
            int r15 = r10.width()     // Catch: java.lang.Exception -> L12c
            int r5 = r13 * 2
            int r15 = r15 + r5
            int r6 = r10.height()     // Catch: java.lang.Exception -> L12c
            int r6 = r6 + r5
            android.graphics.Bitmap r11 = android.graphics.Bitmap.createBitmap(r15, r6, r11)     // Catch: java.lang.Exception -> L12c
            android.graphics.Canvas r15 = new android.graphics.Canvas     // Catch: java.lang.Exception -> L12c
            r15.<init>(r11)     // Catch: java.lang.Exception -> L12c
            int r6 = r10.left     // Catch: java.lang.Exception -> L12c
            int r6 = 0 - r6
            int r6 = r6 + r13
            float r6 = (float) r6     // Catch: java.lang.Exception -> L12c
            int r7 = r10.top     // Catch: java.lang.Exception -> L12c
            int r7 = 0 - r7
            int r7 = r7 + r13
            float r13 = (float) r7     // Catch: java.lang.Exception -> L12c
            r15.drawText(r8, r6, r13, r9)     // Catch: java.lang.Exception -> L12c
            int r8 = r10.width()     // Catch: java.lang.Exception -> L12c
            int r8 = r8 + r5
            int r10 = r10.height()     // Catch: java.lang.Exception -> L12c
            int r10 = r10 + r5
            int r13 = r8 * r10
            int r15 = r13 * r12
            byte[] r15 = new byte[r15]     // Catch: java.lang.Exception -> L12c
            java.nio.ByteBuffer r5 = java.nio.ByteBuffer.wrap(r15)     // Catch: java.lang.Exception -> L12c
            r11.copyPixelsToBuffer(r5)     // Catch: java.lang.Exception -> L12c
            if (r3 == 0) goto L113
            byte[] r13 = new byte[r13]     // Catch: java.lang.Exception -> L12c
            r3 = 0
        Lfa:
            if (r3 >= r10) goto L112
            r5 = 0
        Lfd:
            int r6 = r8 * r12
            if (r5 >= r6) goto L10f
            int r6 = r5 / r12
            int r7 = r3 * r8
            int r6 = r6 + r7
            int r7 = r7 * r12
            int r7 = r7 + r5
            r7 = r15[r7]     // Catch: java.lang.Exception -> L12c
            r13[r6] = r7     // Catch: java.lang.Exception -> L12c
            int r5 = r5 + r12
            goto Lfd
        L10f:
            int r3 = r3 + 1
            goto Lfa
        L112:
            r15 = r13
        L113:
            r0.bitmapWidth = r8     // Catch: java.lang.Exception -> L12c
            r0.bitmapHeight = r10     // Catch: java.lang.Exception -> L12c
            if (r14 == 0) goto L11c
            r0.bitmapPixelMode = r4     // Catch: java.lang.Exception -> L12c
            goto L11e
        L11c:
            r0.bitmapPixelMode = r2     // Catch: java.lang.Exception -> L12c
        L11e:
            int r8 = r15.length     // Catch: java.lang.Exception -> L12c
            r0.bitmapSize = r8     // Catch: java.lang.Exception -> L12c
            r0.bitmapBuffer = r15     // Catch: java.lang.Exception -> L12c
            r11.recycle()     // Catch: java.lang.Exception -> L12c
            r0.bSuccess = r4     // Catch: java.lang.Exception -> L12c
        L128:
            r9.setTypeface(r1)     // Catch: java.lang.Exception -> L12c
            goto L12e
        L12c:
            r0.bSuccess = r2
        L12e:
            return r0
    }

    public static com.autonavi.base.ae.gmap.glyph.GlyphRaster loadPathRaster(java.lang.String r10, com.autonavi.base.ae.gmap.glyph.FontStyle r11, float r12, java.lang.String r13, boolean r14, float r15) {
            com.autonavi.base.ae.gmap.glyph.GlyphRaster r0 = new com.autonavi.base.ae.gmap.glyph.GlyphRaster
            r0.<init>()
            if (r11 != 0) goto L8
            goto Le
        L8:
            boolean r1 = android.text.TextUtils.isEmpty(r10)
            if (r1 == 0) goto Lf
        Le:
            return r0
        Lf:
            r1 = 0
            r2 = 0
            android.text.TextPaint r3 = newTextPaint(r11, r12, r13, r2, r1)     // Catch: java.lang.Exception -> Ldc
            android.graphics.Rect r4 = new android.graphics.Rect     // Catch: java.lang.Exception -> Ldc
            r4.<init>()     // Catch: java.lang.Exception -> Ldc
            int r5 = r10.length()     // Catch: java.lang.Exception -> Ldc
            r3.getTextBounds(r10, r2, r5, r4)     // Catch: java.lang.Exception -> Ldc
            int r5 = r4.width()     // Catch: java.lang.Exception -> Ldc
            int r6 = r4.height()     // Catch: java.lang.Exception -> Ldc
            android.graphics.Bitmap$Config r7 = android.graphics.Bitmap.Config.ALPHA_8     // Catch: java.lang.Exception -> Ldc
            android.graphics.Bitmap r5 = android.graphics.Bitmap.createBitmap(r5, r6, r7)     // Catch: java.lang.Exception -> Ldc
            android.graphics.Canvas r6 = new android.graphics.Canvas     // Catch: java.lang.Exception -> Ldc
            r6.<init>(r5)     // Catch: java.lang.Exception -> Ldc
            int r5 = r4.left     // Catch: java.lang.Exception -> Ldc
            int r5 = 0 - r5
            float r5 = (float) r5     // Catch: java.lang.Exception -> Ldc
            int r4 = r4.top     // Catch: java.lang.Exception -> Ldc
            int r4 = 0 - r4
            float r4 = (float) r4     // Catch: java.lang.Exception -> Ldc
            r6.drawText(r10, r5, r4, r3)     // Catch: java.lang.Exception -> Ldc
            android.text.TextPaint r11 = newTextPaint(r11, r12, r13, r14, r15)     // Catch: java.lang.Exception -> Ldc
            android.graphics.Rect r12 = new android.graphics.Rect     // Catch: java.lang.Exception -> Ldc
            r12.<init>()     // Catch: java.lang.Exception -> Ldc
            int r13 = r10.length()     // Catch: java.lang.Exception -> Ldc
            r11.getTextBounds(r10, r2, r13, r12)     // Catch: java.lang.Exception -> Ldc
            if (r14 == 0) goto L77
            int r13 = (r15 > r1 ? 1 : (r15 == r1 ? 0 : -1))
            if (r13 <= 0) goto L77
            r13 = 1056964608(0x3f000000, float:0.5)
            float r15 = r15 * r13
            int r13 = r12.top     // Catch: java.lang.Exception -> Ldc
            float r13 = (float) r13     // Catch: java.lang.Exception -> Ldc
            float r13 = r13 - r15
            int r13 = (int) r13     // Catch: java.lang.Exception -> Ldc
            r12.top = r13     // Catch: java.lang.Exception -> Ldc
            int r13 = r12.left     // Catch: java.lang.Exception -> Ldc
            float r13 = (float) r13     // Catch: java.lang.Exception -> Ldc
            float r13 = r13 - r15
            int r13 = (int) r13     // Catch: java.lang.Exception -> Ldc
            r12.left = r13     // Catch: java.lang.Exception -> Ldc
            int r13 = r12.right     // Catch: java.lang.Exception -> Ldc
            float r13 = (float) r13     // Catch: java.lang.Exception -> Ldc
            float r13 = r13 + r15
            int r13 = (int) r13     // Catch: java.lang.Exception -> Ldc
            r12.right = r13     // Catch: java.lang.Exception -> Ldc
            int r13 = r12.bottom     // Catch: java.lang.Exception -> Ldc
            float r13 = (float) r13     // Catch: java.lang.Exception -> Ldc
            float r13 = r13 + r15
            int r13 = (int) r13     // Catch: java.lang.Exception -> Ldc
            r12.bottom = r13     // Catch: java.lang.Exception -> Ldc
        L77:
            boolean r13 = r12.isEmpty()     // Catch: java.lang.Exception -> Ldc
            if (r13 != 0) goto Ld4
            int r13 = r12.width()     // Catch: java.lang.Exception -> Ldc
            int r14 = r12.height()     // Catch: java.lang.Exception -> Ldc
            android.graphics.Bitmap r13 = android.graphics.Bitmap.createBitmap(r13, r14, r7)     // Catch: java.lang.Exception -> Ldc
            android.graphics.Canvas r14 = new android.graphics.Canvas     // Catch: java.lang.Exception -> Ldc
            r14.<init>(r13)     // Catch: java.lang.Exception -> Ldc
            int r15 = r12.left     // Catch: java.lang.Exception -> Ldc
            int r15 = 0 - r15
            float r7 = (float) r15     // Catch: java.lang.Exception -> Ldc
            int r15 = r12.top     // Catch: java.lang.Exception -> Ldc
            int r15 = 0 - r15
            float r8 = (float) r15     // Catch: java.lang.Exception -> Ldc
            android.graphics.Path r9 = new android.graphics.Path     // Catch: java.lang.Exception -> Ldc
            r9.<init>()     // Catch: java.lang.Exception -> Ldc
            int r6 = r10.length()     // Catch: java.lang.Exception -> Ldc
            r5 = 0
            r4 = r10
            r3.getTextPath(r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Exception -> Ldc
            r14.drawPath(r9, r11)     // Catch: java.lang.Exception -> Ldc
            int r10 = r12.width()     // Catch: java.lang.Exception -> Ldc
            int r14 = r12.height()     // Catch: java.lang.Exception -> Ldc
            int r10 = r10 * r14
            byte[] r14 = new byte[r10]     // Catch: java.lang.Exception -> Ldc
            java.nio.ByteBuffer r15 = java.nio.ByteBuffer.wrap(r14)     // Catch: java.lang.Exception -> Ldc
            int r1 = r12.width()     // Catch: java.lang.Exception -> Ldc
            r0.bitmapWidth = r1     // Catch: java.lang.Exception -> Ldc
            int r12 = r12.height()     // Catch: java.lang.Exception -> Ldc
            r0.bitmapHeight = r12     // Catch: java.lang.Exception -> Ldc
            r0.bitmapPixelMode = r2     // Catch: java.lang.Exception -> Ldc
            r0.bitmapSize = r10     // Catch: java.lang.Exception -> Ldc
            r13.copyPixelsToBuffer(r15)     // Catch: java.lang.Exception -> Ldc
            r13.recycle()     // Catch: java.lang.Exception -> Ldc
            r0.bitmapBuffer = r14     // Catch: java.lang.Exception -> Ldc
            r10 = 1
            r0.bSuccess = r10     // Catch: java.lang.Exception -> Ldc
        Ld4:
            r10 = 0
            r3.setTypeface(r10)     // Catch: java.lang.Exception -> Ldc
            r11.setTypeface(r10)     // Catch: java.lang.Exception -> Ldc
            return r0
        Ldc:
            r0.bSuccess = r2
            return r0
    }

    private static native long nativeCreateGlyphLoader();

    private static native void nativeDestroyGlyphLoader(long r0);

    private static android.text.TextPaint newTextPaint(com.autonavi.base.ae.gmap.glyph.FontStyle r2, float r3, java.lang.String r4, boolean r5, float r6) {
            android.text.TextPaint r0 = new android.text.TextPaint
            r0.<init>()
            if (r2 != 0) goto L8
            return r0
        L8:
            r1 = -1
            r0.setColor(r1)
            r1 = 1
            r0.setAntiAlias(r1)
            r0.setFilterBitmap(r1)
            r0.setTextSize(r3)
            android.graphics.Paint$Align r3 = android.graphics.Paint.Align.LEFT
            r0.setTextAlign(r3)
            if (r5 == 0) goto L26
            android.graphics.Paint$Style r3 = android.graphics.Paint.Style.STROKE
            r0.setStyle(r3)
            r0.setStrokeWidth(r6)
            goto L2b
        L26:
            android.graphics.Paint$Style r3 = android.graphics.Paint.Style.FILL
            r0.setStyle(r3)
        L2b:
            int r3 = r2.getSlant()
            r5 = 2
            r6 = 0
            if (r3 == 0) goto L37
            if (r3 == r1) goto L39
            if (r3 == r5) goto L39
        L37:
            r3 = 0
            goto L3a
        L39:
            r3 = 1
        L3a:
            int r2 = r2.getWeight()
            switch(r2) {
                case 0: goto L41;
                case 100: goto L41;
                case 200: goto L41;
                case 300: goto L41;
                case 400: goto L41;
                case 500: goto L43;
                case 600: goto L43;
                case 700: goto L43;
                case 800: goto L43;
                case 900: goto L43;
                case 1000: goto L43;
                default: goto L41;
            }
        L41:
            r2 = 0
            goto L44
        L43:
            r2 = 1
        L44:
            if (r2 == 0) goto L4c
            if (r3 == 0) goto L4c
            r0.setFakeBoldText(r1)
            goto L55
        L4c:
            if (r2 == 0) goto L52
            r0.setFakeBoldText(r1)
            goto L55
        L52:
            if (r3 == 0) goto L55
            goto L56
        L55:
            r5 = 0
        L56:
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.NumberFormatException -> L5e
            r3 = 23
            if (r2 < r3) goto L5f
            r1 = 0
            goto L5f
        L5e:
        L5f:
            boolean r2 = r4.isEmpty()
            if (r2 != 0) goto L8c
            if (r1 == 0) goto L68
            goto L8c
        L68:
            java.util.Map<java.lang.String, android.graphics.Typeface> r2 = com.autonavi.base.ae.gmap.glyph.GlyphLoader.FontFaceMap     // Catch: java.lang.Exception -> L85
            monitor-enter(r2)     // Catch: java.lang.Exception -> L85
            java.util.Map<java.lang.String, android.graphics.Typeface> r3 = com.autonavi.base.ae.gmap.glyph.GlyphLoader.FontFaceMap     // Catch: java.lang.Throwable -> L7f
            java.lang.Object r3 = r3.get(r4)     // Catch: java.lang.Throwable -> L7f
            android.graphics.Typeface r3 = (android.graphics.Typeface) r3     // Catch: java.lang.Throwable -> L7f
            if (r3 != 0) goto L81
            android.graphics.Typeface r3 = android.graphics.Typeface.createFromFile(r4)     // Catch: java.lang.Throwable -> L7f
            java.util.Map<java.lang.String, android.graphics.Typeface> r6 = com.autonavi.base.ae.gmap.glyph.GlyphLoader.FontFaceMap     // Catch: java.lang.Throwable -> L7f
            r6.put(r4, r3)     // Catch: java.lang.Throwable -> L7f
            goto L81
        L7f:
            r3 = move-exception
            goto L83
        L81:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L7f
            goto L92
        L83:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L7f
            throw r3     // Catch: java.lang.Exception -> L85
        L85:
            android.graphics.Typeface r2 = android.graphics.Typeface.DEFAULT
            android.graphics.Typeface r3 = android.graphics.Typeface.create(r2, r5)
            goto L92
        L8c:
            android.graphics.Typeface r2 = android.graphics.Typeface.DEFAULT
            android.graphics.Typeface r3 = android.graphics.Typeface.create(r2, r5)
        L92:
            r0.setTypeface(r3)
            return r0
    }
}
