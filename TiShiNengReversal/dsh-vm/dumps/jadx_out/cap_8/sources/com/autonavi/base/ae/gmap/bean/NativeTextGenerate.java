package com.autonavi.base.ae.gmap.bean;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class NativeTextGenerate {

    @com.autonavi.base.amap.mapcore.jbinding.JBindingExclude
    private static volatile com.autonavi.base.ae.gmap.bean.NativeTextGenerate instance;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingExclude
    private float density;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingExclude
    private final int kTextAlignmentCenter;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingExclude
    private final int kTextAlignmentLeft;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingExclude
    private final int kTextAlignmentRight;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingExclude
    private final int kTextLayoutLeftToRight;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingExclude
    private final int kTextLayoutUpToDown;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingExclude
    private android.text.TextPaint text_paint_bitmap;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingExclude
    private android.text.TextPaint text_paint_size;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    static class TextGeneratePOIStyleDesc {
        int boldFont;
        int fontBgColor;
        int fontBorderColor;
        int fontColor;
        int fontSize;

        TextGeneratePOIStyleDesc() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.fontSize = r0
                r1.fontColor = r0
                r1.fontBorderColor = r0
                r1.fontBgColor = r0
                r1.boldFont = r0
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    static class TextGenerateTextBitmap {
        byte[] data;
        public int dataId;
        int dataLength;
        double height;
        com.amap.api.maps.model.BitmapDescriptor imageData;
        java.lang.String text;
        double width;

        TextGenerateTextBitmap() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    static class TextGenerateTextStyle {
        int layoutDirection;
        int singleLineCharaterLimit;
        int textAlignment;

        TextGenerateTextStyle() {
                r1 = this;
                r1.<init>()
                r0 = 7
                r1.singleLineCharaterLimit = r0
                r0 = 0
                r1.textAlignment = r0
                r1.layoutDirection = r0
                return
        }
    }

    @com.autonavi.base.amap.mapcore.jbinding.JBindingExclude
    private NativeTextGenerate() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.text_paint_size = r0
            r2.text_paint_bitmap = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            r2.density = r0
            r0 = 0
            r2.kTextLayoutLeftToRight = r0
            r1 = 1
            r2.kTextLayoutUpToDown = r1
            r2.kTextAlignmentCenter = r0
            r2.kTextAlignmentLeft = r1
            r0 = 2
            r2.kTextAlignmentRight = r0
            android.text.TextPaint r0 = new android.text.TextPaint
            r0.<init>()
            r2.text_paint_size = r0
            android.text.TextPaint r0 = new android.text.TextPaint
            r0.<init>()
            r2.text_paint_bitmap = r0
            return
    }

    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    public static com.autonavi.base.ae.gmap.bean.NativeTextGenerate getInstance() {
            com.autonavi.base.ae.gmap.bean.NativeTextGenerate r0 = com.autonavi.base.ae.gmap.bean.NativeTextGenerate.instance
            if (r0 != 0) goto L19
            java.lang.Class<com.autonavi.base.ae.gmap.bean.NativeTextGenerate> r0 = com.autonavi.base.ae.gmap.bean.NativeTextGenerate.class
            monitor-enter(r0)
            com.autonavi.base.ae.gmap.bean.NativeTextGenerate r1 = com.autonavi.base.ae.gmap.bean.NativeTextGenerate.instance     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.autonavi.base.ae.gmap.bean.NativeTextGenerate r1 = new com.autonavi.base.ae.gmap.bean.NativeTextGenerate     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.autonavi.base.ae.gmap.bean.NativeTextGenerate.instance = r1     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r1 = move-exception
            goto L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            goto L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r1
        L19:
            com.autonavi.base.ae.gmap.bean.NativeTextGenerate r0 = com.autonavi.base.ae.gmap.bean.NativeTextGenerate.instance
            return r0
    }

    @com.autonavi.base.amap.mapcore.jbinding.JBindingExclude
    private android.text.StaticLayout setPaintStyle(android.text.TextPaint r10, com.autonavi.base.ae.gmap.bean.NativeTextGenerate.TextGenerateTextBitmap r11, com.autonavi.base.ae.gmap.bean.NativeTextGenerate.TextGenerateTextStyle r12, com.autonavi.base.ae.gmap.bean.NativeTextGenerate.TextGeneratePOIStyleDesc r13) {
            r9 = this;
            if (r11 == 0) goto L73
            if (r12 == 0) goto L73
            if (r13 != 0) goto L7
            goto L73
        L7:
            int r0 = r13.fontSize
            float r0 = (float) r0
            float r1 = r9.density
            float r0 = r0 * r1
            int r1 = r13.fontColor
            r10.setColor(r1)
            r10.setTextSize(r0)
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.FILL
            r10.setStyle(r1)
            r1 = 1
            r10.setAntiAlias(r1)
            r10.setFilterBitmap(r1)
            int r13 = r13.boldFont
            if (r13 != r1) goto L29
            android.graphics.Typeface r13 = android.graphics.Typeface.DEFAULT_BOLD
            goto L2b
        L29:
            android.graphics.Typeface r13 = android.graphics.Typeface.DEFAULT
        L2b:
            r10.setTypeface(r13)
            int r13 = r12.textAlignment
            if (r13 == 0) goto L41
            r2 = 2
            if (r13 == r2) goto L3b
            android.graphics.Paint$Align r13 = android.graphics.Paint.Align.LEFT
            r10.setTextAlign(r13)
            goto L46
        L3b:
            android.graphics.Paint$Align r13 = android.graphics.Paint.Align.RIGHT
            r10.setTextAlign(r13)
            goto L46
        L41:
            android.graphics.Paint$Align r13 = android.graphics.Paint.Align.CENTER
            r10.setTextAlign(r13)
        L46:
            java.lang.String r13 = r11.text
            int r13 = r13.length()
            int r12 = r12.singleLineCharaterLimit
            if (r13 > r12) goto L54
            int r2 = r13 % r12
            if (r2 == 0) goto L60
        L54:
            int r12 = r13 / r12
            int r12 = r12 + r1
            int r2 = r13 / r12
            int r13 = r13 % r12
            if (r13 <= 0) goto L5d
            goto L5e
        L5d:
            r1 = 0
        L5e:
            int r12 = r2 + r1
        L60:
            android.text.StaticLayout r1 = new android.text.StaticLayout
            java.lang.String r2 = r11.text
            float r11 = (float) r12
            float r0 = r0 * r11
            int r4 = (int) r0
            android.text.Layout$Alignment r5 = android.text.Layout.Alignment.ALIGN_NORMAL
            r7 = 0
            r8 = 0
            r6 = 1065353216(0x3f800000, float:1.0)
            r3 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return r1
        L73:
            r10 = 0
            return r10
    }

    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    void calculateTextBoundSize(com.autonavi.base.ae.gmap.bean.NativeTextGenerate.TextGenerateTextBitmap r4, com.autonavi.base.ae.gmap.bean.NativeTextGenerate.TextGenerateTextStyle r5, com.autonavi.base.ae.gmap.bean.NativeTextGenerate.TextGeneratePOIStyleDesc r6) {
            r3 = this;
            if (r4 == 0) goto L34
            if (r5 == 0) goto L34
            if (r6 != 0) goto L7
            goto L34
        L7:
            android.text.TextPaint r0 = r3.text_paint_size
            android.text.StaticLayout r5 = r3.setPaintStyle(r0, r4, r5, r6)
            android.text.TextPaint r6 = r3.text_paint_size
            java.lang.String r0 = r4.text
            float r6 = r6.measureText(r0)
            android.text.TextPaint r0 = r3.text_paint_size
            android.graphics.Paint$FontMetrics r0 = r0.getFontMetrics()
            double r1 = (double) r6
            r4.width = r1
            float r6 = r0.descent
            float r0 = r0.ascent
            float r6 = r6 - r0
            double r0 = (double) r6
            r4.height = r0
            int r6 = r5.getWidth()
            double r0 = (double) r6
            r4.width = r0
            int r5 = r5.getHeight()
            double r5 = (double) r5
            r4.height = r5
        L34:
            return
    }

    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    void generateTextBitmap(com.autonavi.base.ae.gmap.bean.NativeTextGenerate.TextGenerateTextBitmap r7, com.autonavi.base.ae.gmap.bean.NativeTextGenerate.TextGenerateTextStyle r8, com.autonavi.base.ae.gmap.bean.NativeTextGenerate.TextGeneratePOIStyleDesc r9) {
            r6 = this;
            if (r7 == 0) goto L71
            if (r8 == 0) goto L71
            if (r9 != 0) goto L7
            goto L71
        L7:
            android.text.TextPaint r0 = r6.text_paint_bitmap
            android.text.StaticLayout r0 = r6.setPaintStyle(r0, r7, r8, r9)
            double r1 = r7.width
            int r1 = (int) r1
            double r2 = r7.height
            int r2 = (int) r2
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createBitmap(r1, r2, r3)
            android.graphics.Canvas r2 = new android.graphics.Canvas
            r2.<init>(r1)
            int r8 = r8.textAlignment
            r3 = 0
            if (r8 != 0) goto L2d
            double r4 = r7.width
            float r8 = (float) r4
            r4 = 1073741824(0x40000000, float:2.0)
            float r8 = r8 / r4
            r2.translate(r8, r3)
            goto L36
        L2d:
            r4 = 2
            if (r8 != r4) goto L36
            double r4 = r7.width
            float r8 = (float) r4
            r2.translate(r8, r3)
        L36:
            r0.draw(r2)
            android.text.TextPaint r8 = r6.text_paint_bitmap
            android.graphics.Paint$Style r3 = android.graphics.Paint.Style.STROKE
            r8.setStyle(r3)
            android.text.TextPaint r8 = r6.text_paint_bitmap
            r3 = 1065353216(0x3f800000, float:1.0)
            r8.setStrokeWidth(r3)
            android.text.TextPaint r8 = r6.text_paint_bitmap
            int r9 = r9.fontBorderColor
            r8.setColor(r9)
            r0.draw(r2)
            double r8 = r7.width
            double r2 = r7.height
            double r8 = r8 * r2
            r2 = 4616189618054758400(0x4010000000000000, double:4.0)
            double r8 = r8 * r2
            int r8 = (int) r8
            r7.dataLength = r8
            byte[] r8 = new byte[r8]
            r7.data = r8
            int r8 = com.amap.api.col.p0003l.b3.V()
            r7.dataId = r8
            byte[] r7 = r7.data
            java.nio.ByteBuffer r7 = java.nio.ByteBuffer.wrap(r7)
            r1.copyPixelsToBuffer(r7)
        L71:
            return
    }

    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    com.amap.api.maps.model.BitmapDescriptor getIconBitmap(java.lang.String r4) {
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            android.content.Context r1 = com.amap.api.col.p0003l.d.f3124f     // Catch: java.lang.Throwable -> L2e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
            r2.<init>()     // Catch: java.lang.Throwable -> L2e
            r2.append(r4)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r4 = "_"
            r2.append(r4)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r4 = r2.toString()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r2 = "icons_assets"
            byte[] r4 = com.autonavi.base.amap.mapcore.FileUtil.readFileContentsFromAssetsByPreName(r1, r2, r4)     // Catch: java.lang.Throwable -> L2e
            byte[] r4 = com.autonavi.base.amap.mapcore.FileUtil.uncompress(r4)     // Catch: java.lang.Throwable -> L2e
            if (r4 == 0) goto L32
            int r1 = r4.length     // Catch: java.lang.Throwable -> L2e
            r2 = 0
            android.graphics.Bitmap r4 = android.graphics.BitmapFactory.decodeByteArray(r4, r2, r1)     // Catch: java.lang.Throwable -> L2e
            com.amap.api.maps.model.BitmapDescriptor r4 = com.amap.api.maps.model.BitmapDescriptorFactory.fromBitmap(r4)     // Catch: java.lang.Throwable -> L2e
            return r4
        L2e:
            r4 = move-exception
            com.amap.api.col.p0003l.b3.D(r4)
        L32:
            return r0
    }

    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    byte[] getMapStyleJsonData() {
            r2 = this;
            java.lang.String r0 = "map_custom/terrain/terrainStyle.data"
            android.content.Context r1 = com.amap.api.col.p0003l.d.f3124f     // Catch: java.lang.Throwable -> Ld
            byte[] r0 = com.autonavi.base.amap.mapcore.FileUtil.readFileContentsFromAssets(r1, r0)     // Catch: java.lang.Throwable -> Ld
            byte[] r0 = com.autonavi.base.amap.mapcore.FileUtil.uncompress(r0)     // Catch: java.lang.Throwable -> Ld
            return r0
        Ld:
            r0 = move-exception
            com.amap.api.col.p0003l.b3.D(r0)
            r0 = 0
            return r0
    }

    @com.autonavi.base.amap.mapcore.jbinding.JBindingExclude
    public void setDensity(float r1) {
            r0 = this;
            r0.density = r1
            return
    }
}
