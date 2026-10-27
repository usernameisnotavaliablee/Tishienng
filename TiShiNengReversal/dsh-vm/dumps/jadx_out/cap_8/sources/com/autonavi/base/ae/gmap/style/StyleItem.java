package com.autonavi.base.ae.gmap.style;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class StyleItem {
    public int mainKey;
    private java.util.Map<java.lang.Integer, com.autonavi.base.ae.gmap.style.StyleElement> styleElements;
    private int styleTypeId;
    public int[] subKey;

    public StyleItem(int r2) {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.styleElements = r0
            r1.styleTypeId = r2
            return
    }

    public com.autonavi.base.ae.gmap.style.StyleElement get(int r2) {
            r1 = this;
            java.util.Map<java.lang.Integer, com.autonavi.base.ae.gmap.style.StyleElement> r0 = r1.styleElements
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r2 = r0.get(r2)
            com.autonavi.base.ae.gmap.style.StyleElement r2 = (com.autonavi.base.ae.gmap.style.StyleElement) r2
            return r2
    }

    public com.autonavi.base.ae.gmap.style.StyleElement[] getStyleElements() {
            r2 = this;
            java.util.Map<java.lang.Integer, com.autonavi.base.ae.gmap.style.StyleElement> r0 = r2.styleElements
            if (r0 == 0) goto L1f
            int r0 = r0.size()
            if (r0 <= 0) goto L1f
            java.util.Map<java.lang.Integer, com.autonavi.base.ae.gmap.style.StyleElement> r0 = r2.styleElements
            int r0 = r0.size()
            com.autonavi.base.ae.gmap.style.StyleElement[] r0 = new com.autonavi.base.ae.gmap.style.StyleElement[r0]
            java.util.Map<java.lang.Integer, com.autonavi.base.ae.gmap.style.StyleElement> r1 = r2.styleElements
            java.util.Collection r1 = r1.values()
            java.lang.Object[] r0 = r1.toArray(r0)
            com.autonavi.base.ae.gmap.style.StyleElement[] r0 = (com.autonavi.base.ae.gmap.style.StyleElement[]) r0
            return r0
        L1f:
            r0 = 0
            return r0
    }

    public boolean isValid() {
            r1 = this;
            java.util.Map<java.lang.Integer, com.autonavi.base.ae.gmap.style.StyleElement> r0 = r1.styleElements
            int r0 = r0.size()
            if (r0 <= 0) goto Le
            int r0 = r1.styleTypeId
            if (r0 < 0) goto Le
            r0 = 1
            return r0
        Le:
            r0 = 0
            return r0
    }

    public void put(int r2, com.autonavi.base.ae.gmap.style.StyleElement r3) {
            r1 = this;
            java.util.Map<java.lang.Integer, com.autonavi.base.ae.gmap.style.StyleElement> r0 = r1.styleElements
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r2, r3)
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "styleTypeId:"
            r0.append(r1)
            int r1 = r2.styleTypeId
            r0.append(r1)
            java.lang.String r1 = "\n"
            r0.append(r1)
            java.lang.String r1 = "styleElements.size :"
            r0.append(r1)
            java.util.Map<java.lang.Integer, com.autonavi.base.ae.gmap.style.StyleElement> r1 = r2.styleElements
            int r1 = r1.size()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
