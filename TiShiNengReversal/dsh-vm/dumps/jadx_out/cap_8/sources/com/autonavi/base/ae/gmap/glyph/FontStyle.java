package com.autonavi.base.ae.gmap.glyph;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class FontStyle {
    public static final int SLANT_ITALIC = 1;
    public static final int SLANT_OBLIQUE = 2;
    public static final int SLANT_UPRIGHT = 0;
    public static final int WEIGHT_BLACK = 900;
    public static final int WEIGHT_BOLD = 700;
    public static final int WEIGHT_EXTRA_BLACK = 1000;
    public static final int WEIGHT_EXTRA_BOLD = 800;
    public static final int WEIGHT_EXTRA_LIGHT = 200;
    public static final int WEIGHT_INVISIBLE = 0;
    public static final int WEIGHT_LIGHT = 300;
    public static final int WEIGHT_MEDIUM = 500;
    public static final int WEIGHT_NORMAL = 400;
    public static final int WEIGHT_SEMI_BOLD = 600;
    public static final int WEIGHT_THIN = 100;
    public static final int WIDTH_CONDENSED = 3;
    public static final int WIDTH_EXPANDED = 7;
    public static final int WIDTH_EXTRA_CONDENSED = 2;
    public static final int WIDTH_EXTRA_EXPANDED = 8;
    public static final int WIDTH_NORMAL = 5;
    public static final int WIDTH_SEMI_CONDENSED = 4;
    public static final int WIDTH_SEMI_EXPANDED = 6;
    public static final int WIDTH_ULTRA_CONDENSED = 1;
    public static final int WIDTH_ULTRA_EXPANDED = 9;
    private int nFontStyleCode;

    public FontStyle() {
            r1 = this;
            r1.<init>()
            r0 = 328080(0x50190, float:4.59738E-40)
            r1.nFontStyleCode = r0
            return
    }

    public FontStyle(int r1) {
            r0 = this;
            r0.<init>()
            r0.nFontStyleCode = r1
            return
    }

    public FontStyle(int r1, int r2, int r3) {
            r0 = this;
            r0.<init>()
            int r1 = r1 + r2
            int r2 = r3 << 24
            int r2 = r2 + 16
            int r1 = r1 << r2
            r0.nFontStyleCode = r1
            return
    }

    com.autonavi.base.ae.gmap.glyph.FontStyle Bold() {
            r4 = this;
            com.autonavi.base.ae.gmap.glyph.FontStyle r0 = new com.autonavi.base.ae.gmap.glyph.FontStyle
            r1 = 5
            r2 = 0
            r3 = 700(0x2bc, float:9.81E-43)
            r0.<init>(r3, r1, r2)
            return r0
    }

    com.autonavi.base.ae.gmap.glyph.FontStyle BoldItalic() {
            r4 = this;
            com.autonavi.base.ae.gmap.glyph.FontStyle r0 = new com.autonavi.base.ae.gmap.glyph.FontStyle
            r1 = 5
            r2 = 1
            r3 = 700(0x2bc, float:9.81E-43)
            r0.<init>(r3, r1, r2)
            return r0
    }

    com.autonavi.base.ae.gmap.glyph.FontStyle Italic() {
            r4 = this;
            com.autonavi.base.ae.gmap.glyph.FontStyle r0 = new com.autonavi.base.ae.gmap.glyph.FontStyle
            r1 = 5
            r2 = 1
            r3 = 400(0x190, float:5.6E-43)
            r0.<init>(r3, r1, r2)
            return r0
    }

    com.autonavi.base.ae.gmap.glyph.FontStyle Normal() {
            r4 = this;
            com.autonavi.base.ae.gmap.glyph.FontStyle r0 = new com.autonavi.base.ae.gmap.glyph.FontStyle
            r1 = 5
            r2 = 0
            r3 = 400(0x190, float:5.6E-43)
            r0.<init>(r3, r1, r2)
            return r0
    }

    int getCode() {
            r1 = this;
            int r0 = r1.nFontStyleCode
            return r0
    }

    public int getSlant() {
            r1 = this;
            int r0 = r1.nFontStyleCode
            int r0 = r0 >> 24
            r0 = r0 & 255(0xff, float:3.57E-43)
            return r0
    }

    public int getWeight() {
            r2 = this;
            int r0 = r2.nFontStyleCode
            r1 = 65535(0xffff, float:9.1834E-41)
            r0 = r0 & r1
            return r0
    }

    public int getWidth() {
            r1 = this;
            int r0 = r1.nFontStyleCode
            int r0 = r0 >> 16
            r0 = r0 & 255(0xff, float:3.57E-43)
            return r0
    }

    boolean isBold() {
            r2 = this;
            int r0 = r2.getWeight()
            r1 = 600(0x258, float:8.41E-43)
            if (r0 < r1) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    boolean isItalic() {
            r1 = this;
            int r0 = r1.getSlant()
            if (r0 == 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }
}
