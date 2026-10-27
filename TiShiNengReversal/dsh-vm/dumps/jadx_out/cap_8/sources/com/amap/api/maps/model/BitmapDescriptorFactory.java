package com.amap.api.maps.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class BitmapDescriptorFactory {
    public static final float HUE_AZURE = 210.0f;
    public static final float HUE_BLUE = 240.0f;
    public static final float HUE_CYAN = 180.0f;
    public static final float HUE_GREEN = 120.0f;
    public static final float HUE_MAGENTA = 300.0f;
    public static final float HUE_ORANGE = 30.0f;
    public static final float HUE_RED = 0.0f;
    public static final float HUE_ROSE = 330.0f;
    public static final float HUE_VIOLET = 270.0f;
    public static final float HUE_YELLOW = 60.0f;
    private static final java.lang.String ICON_ID_PREFIX = "com.amap.api.icon_";

    public BitmapDescriptorFactory() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.amap.api.maps.model.BitmapDescriptor defaultMarker() {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1c
            r0.<init>()     // Catch: java.lang.Throwable -> L1c
            com.amap.api.col.3l.dk$a r1 = com.amap.api.col.3l.dk.a.f3160b     // Catch: java.lang.Throwable -> L1c
            java.lang.String r1 = r1.name()     // Catch: java.lang.Throwable -> L1c
            r0.append(r1)     // Catch: java.lang.Throwable -> L1c
            java.lang.String r1 = ".png"
            r0.append(r1)     // Catch: java.lang.Throwable -> L1c
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L1c
            com.amap.api.maps.model.BitmapDescriptor r0 = fromAsset(r0)     // Catch: java.lang.Throwable -> L1c
            return r0
        L1c:
            r0 = move-exception
            com.amap.api.col.p0003l.b3.D(r0)
            r0 = 0
            return r0
    }

    public static com.amap.api.maps.model.BitmapDescriptor defaultMarker(float r3) {
            r0 = 1097859072(0x41700000, float:15.0)
            float r3 = r3 + r0
            int r3 = (int) r3
            int r3 = r3 / 30
            int r3 = r3 * 30
            float r3 = (float) r3     // Catch: java.lang.Throwable -> L85
            r0 = 0
            r1 = 1134886912(0x43a50000, float:330.0)
            int r2 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r2 <= 0) goto L13
            r3 = 1134886912(0x43a50000, float:330.0)
            goto L18
        L13:
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 >= 0) goto L18
            r3 = 0
        L18:
            java.lang.String r2 = ""
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 != 0) goto L21
            java.lang.String r2 = "RED"
            goto L6f
        L21:
            r0 = 1106247680(0x41f00000, float:30.0)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 != 0) goto L2a
            java.lang.String r2 = "ORANGE"
            goto L6f
        L2a:
            r0 = 1114636288(0x42700000, float:60.0)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 != 0) goto L33
            java.lang.String r2 = "YELLOW"
            goto L6f
        L33:
            r0 = 1123024896(0x42f00000, float:120.0)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 != 0) goto L3c
            java.lang.String r2 = "GREEN"
            goto L6f
        L3c:
            r0 = 1127481344(0x43340000, float:180.0)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 != 0) goto L45
            java.lang.String r2 = "CYAN"
            goto L6f
        L45:
            r0 = 1129447424(0x43520000, float:210.0)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 != 0) goto L4e
            java.lang.String r2 = "AZURE"
            goto L6f
        L4e:
            r0 = 1131413504(0x43700000, float:240.0)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 != 0) goto L57
            java.lang.String r2 = "BLUE"
            goto L6f
        L57:
            r0 = 1132920832(0x43870000, float:270.0)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 != 0) goto L60
            java.lang.String r2 = "VIOLET"
            goto L6f
        L60:
            r0 = 1133903872(0x43960000, float:300.0)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 != 0) goto L69
            java.lang.String r2 = "MAGENTA"
            goto L6f
        L69:
            int r3 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r3 != 0) goto L6f
            java.lang.String r2 = "ROSE"
        L6f:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L85
            r3.<init>()     // Catch: java.lang.Throwable -> L85
            r3.append(r2)     // Catch: java.lang.Throwable -> L85
            java.lang.String r0 = ".png"
            r3.append(r0)     // Catch: java.lang.Throwable -> L85
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L85
            com.amap.api.maps.model.BitmapDescriptor r3 = fromAsset(r3)     // Catch: java.lang.Throwable -> L85
            return r3
        L85:
            r3 = move-exception
            com.amap.api.col.p0003l.b3.D(r3)
            r3 = 0
            return r3
    }

    public static com.amap.api.maps.model.BitmapDescriptor fromAsset(java.lang.String r3) {
            android.content.Context r0 = getContext()     // Catch: java.lang.Throwable -> L2b
            if (r0 == 0) goto Lf
            android.graphics.Bitmap r3 = com.amap.api.col.p0003l.b3.l(r0, r3)     // Catch: java.lang.Throwable -> L2b
            com.amap.api.maps.model.BitmapDescriptor r3 = fromBitmap(r3)     // Catch: java.lang.Throwable -> L2b
            return r3
        Lf:
            java.lang.Class<com.amap.api.maps.model.BitmapDescriptorFactory> r0 = com.amap.api.maps.model.BitmapDescriptorFactory.class
            java.lang.String r1 = "/assets/"
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r3 = r1.concat(r3)     // Catch: java.lang.Throwable -> L2b
            java.io.InputStream r3 = r0.getResourceAsStream(r3)     // Catch: java.lang.Throwable -> L2b
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeStream(r3)     // Catch: java.lang.Throwable -> L2b
            r3.close()     // Catch: java.lang.Throwable -> L2b
            com.amap.api.maps.model.BitmapDescriptor r3 = fromBitmap(r0)     // Catch: java.lang.Throwable -> L2b
            return r3
        L2b:
            r3 = move-exception
            com.amap.api.col.p0003l.b3.D(r3)
            java.lang.String r0 = com.amap.api.col.p0003l.c3.f3067f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "read bitmap from assets failed "
            r1.<init>(r2)
            java.lang.String r3 = r3.getMessage()
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            com.amap.api.col.p0003l.d3.l(r0, r3)
            r3 = 0
            return r3
    }

    public static com.amap.api.maps.model.BitmapDescriptor fromBitmap(android.graphics.Bitmap r4) {
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1c
            java.lang.String r2 = "com.amap.api.icon_"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L1c
            int r2 = com.amap.api.col.p0003l.b3.V()     // Catch: java.lang.Throwable -> L1c
            r1.append(r2)     // Catch: java.lang.Throwable -> L1c
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L1c
            com.amap.api.maps.model.BitmapDescriptor r2 = new com.amap.api.maps.model.BitmapDescriptor     // Catch: java.lang.Throwable -> L1c
            r2.<init>(r4, r1)     // Catch: java.lang.Throwable -> L1c
            return r2
        L1c:
            r4 = move-exception
            com.amap.api.col.p0003l.b3.D(r4)
            java.lang.String r1 = com.amap.api.col.p0003l.c3.f3067f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "read bitmap from bitmap failed "
            r2.<init>(r3)
            java.lang.String r4 = r4.getMessage()
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            com.amap.api.col.p0003l.d3.l(r1, r4)
            return r0
    }

    public static com.amap.api.maps.model.BitmapDescriptor fromFile(java.lang.String r4) {
            r0 = 0
            android.content.Context r1 = getContext()     // Catch: java.lang.Throwable -> L1a
            if (r1 == 0) goto L1c
            java.io.FileInputStream r4 = r1.openFileInput(r4)     // Catch: java.lang.Throwable -> L1a
            android.graphics.Bitmap r1 = android.graphics.BitmapFactory.decodeStream(r4)     // Catch: java.lang.Throwable -> L1a
            r4.close()     // Catch: java.lang.Throwable -> L1a
            com.amap.api.maps.model.BitmapDescriptor r4 = fromBitmap(r1)     // Catch: java.lang.Throwable -> L1a
            com.amap.api.col.p0003l.b3.B(r1)     // Catch: java.lang.Throwable -> L1a
            return r4
        L1a:
            r4 = move-exception
            goto L1d
        L1c:
            return r0
        L1d:
            com.amap.api.col.p0003l.b3.D(r4)
            java.lang.String r1 = com.amap.api.col.p0003l.c3.f3067f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "read bitmap from disk failed "
            r2.<init>(r3)
            java.lang.String r4 = r4.getMessage()
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            com.amap.api.col.p0003l.d3.l(r1, r4)
            return r0
    }

    public static com.amap.api.maps.model.BitmapDescriptor fromPath(java.lang.String r3) {
            android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeFile(r3)     // Catch: java.lang.Throwable -> L9
            com.amap.api.maps.model.BitmapDescriptor r3 = fromBitmap(r3)     // Catch: java.lang.Throwable -> L9
            return r3
        L9:
            r3 = move-exception
            com.amap.api.col.p0003l.b3.D(r3)
            java.lang.String r0 = com.amap.api.col.p0003l.c3.f3067f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "read bitmap from disk failed "
            r1.<init>(r2)
            java.lang.String r3 = r3.getMessage()
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            com.amap.api.col.p0003l.d3.l(r0, r3)
            r3 = 0
            return r3
    }

    public static com.amap.api.maps.model.BitmapDescriptor fromResource(int r4) {
            r0 = 0
            android.content.Context r1 = getContext()     // Catch: java.lang.Throwable -> L18
            if (r1 == 0) goto L1a
            android.content.res.Resources r1 = r1.getResources()     // Catch: java.lang.Throwable -> L18
            java.io.InputStream r4 = r1.openRawResource(r4)     // Catch: java.lang.Throwable -> L18
            android.graphics.Bitmap r4 = android.graphics.BitmapFactory.decodeStream(r4)     // Catch: java.lang.Throwable -> L18
            com.amap.api.maps.model.BitmapDescriptor r4 = fromBitmap(r4)     // Catch: java.lang.Throwable -> L18
            return r4
        L18:
            r4 = move-exception
            goto L1b
        L1a:
            return r0
        L1b:
            com.amap.api.col.p0003l.b3.D(r4)
            java.lang.String r1 = com.amap.api.col.p0003l.c3.f3067f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "read bitmap from res failed "
            r2.<init>(r3)
            java.lang.String r4 = r4.getMessage()
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            com.amap.api.col.p0003l.d3.l(r1, r4)
            return r0
    }

    public static com.amap.api.maps.model.BitmapDescriptor fromView(android.view.View r4) {
            r0 = 0
            android.content.Context r1 = getContext()     // Catch: java.lang.Throwable -> L1c
            if (r1 == 0) goto L1e
            android.widget.FrameLayout r2 = new android.widget.FrameLayout     // Catch: java.lang.Throwable -> L1c
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L1c
            r2.addView(r4)     // Catch: java.lang.Throwable -> L1c
            r4 = 1
            r2.setDrawingCacheEnabled(r4)     // Catch: java.lang.Throwable -> L1c
            android.graphics.Bitmap r4 = com.amap.api.col.p0003l.b3.n(r2)     // Catch: java.lang.Throwable -> L1c
            com.amap.api.maps.model.BitmapDescriptor r4 = fromBitmap(r4)     // Catch: java.lang.Throwable -> L1c
            return r4
        L1c:
            r4 = move-exception
            goto L1f
        L1e:
            return r0
        L1f:
            com.amap.api.col.p0003l.b3.D(r4)
            java.lang.String r1 = com.amap.api.col.p0003l.c3.f3067f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "read bitmap from view failed "
            r2.<init>(r3)
            java.lang.String r4 = r4.getMessage()
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            com.amap.api.col.p0003l.d3.l(r1, r4)
            return r0
    }

    public static android.content.Context getContext() {
            android.content.Context r0 = com.amap.api.col.p0003l.d.f3124f
            return r0
    }
}
