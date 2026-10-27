package com.bytedance.adsdk.lottie.r;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
class mi {

    /* renamed from: com.bytedance.adsdk.lottie.r.mi$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] j = null;

        static {
                android.util.JsonToken[] r0 = android.util.JsonToken.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.bytedance.adsdk.lottie.r.mi.AnonymousClass1.j = r0
                android.util.JsonToken r1 = android.util.JsonToken.NUMBER     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.bytedance.adsdk.lottie.r.mi.AnonymousClass1.j     // Catch: java.lang.NoSuchFieldError -> L1d
                android.util.JsonToken r1 = android.util.JsonToken.BEGIN_ARRAY     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.bytedance.adsdk.lottie.r.mi.AnonymousClass1.j     // Catch: java.lang.NoSuchFieldError -> L28
                android.util.JsonToken r1 = android.util.JsonToken.BEGIN_OBJECT     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                return
        }

        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    public mi() {
            r1 = this;
            r1.<init>()
            return
    }

    private static android.graphics.PointF cw(android.util.JsonReader r3, float r4) throws java.io.IOException {
            double r0 = r3.nextDouble()
            float r0 = (float) r0
            double r1 = r3.nextDouble()
            float r1 = (float) r1
        La:
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto L14
            r3.skipValue()
            goto La
        L14:
            android.graphics.PointF r3 = new android.graphics.PointF
            float r0 = r0 * r4
            float r1 = r1 * r4
            r3.<init>(r0, r1)
            return r3
    }

    @com.bytedance.component.sdk.annotation.ColorInt
    static int j(android.util.JsonReader r6) throws java.io.IOException {
            r6.beginArray()
            double r0 = r6.nextDouble()
            r2 = 4643176031446892544(0x406fe00000000000, double:255.0)
            double r0 = r0 * r2
            int r0 = (int) r0
            double r4 = r6.nextDouble()
            double r4 = r4 * r2
            int r1 = (int) r4
            double r4 = r6.nextDouble()
            double r4 = r4 * r2
            int r2 = (int) r4
        L1d:
            boolean r3 = r6.hasNext()
            if (r3 == 0) goto L27
            r6.skipValue()
            goto L1d
        L27:
            r6.endArray()
            r6 = 255(0xff, float:3.57E-43)
            int r6 = android.graphics.Color.argb(r6, r0, r1, r2)
            return r6
    }

    static java.util.List<android.graphics.PointF> j(android.util.JsonReader r3, float r4) throws java.io.IOException {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.beginArray()
        L8:
            android.util.JsonToken r1 = r3.peek()
            android.util.JsonToken r2 = android.util.JsonToken.BEGIN_ARRAY
            if (r1 != r2) goto L1e
            r3.beginArray()
            android.graphics.PointF r1 = xt(r3, r4)
            r0.add(r1)
            r3.endArray()
            goto L8
        L1e:
            r3.endArray()
            return r0
    }

    private static android.graphics.PointF r(android.util.JsonReader r4, float r5) throws java.io.IOException {
            r4.beginArray()
            double r0 = r4.nextDouble()
            float r0 = (float) r0
            double r1 = r4.nextDouble()
            float r1 = (float) r1
        Ld:
            android.util.JsonToken r2 = r4.peek()
            android.util.JsonToken r3 = android.util.JsonToken.END_ARRAY
            if (r2 == r3) goto L19
            r4.skipValue()
            goto Ld
        L19:
            r4.endArray()
            android.graphics.PointF r4 = new android.graphics.PointF
            float r0 = r0 * r5
            float r1 = r1 * r5
            r4.<init>(r0, r1)
            return r4
    }

    private static android.graphics.PointF up(android.util.JsonReader r4, float r5) throws java.io.IOException {
            r4.beginObject()
            r0 = 0
            r1 = 0
        L5:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L30
            java.lang.String r2 = r4.nextName()
            r2.getClass()
            java.lang.String r3 = "x"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L2b
            java.lang.String r3 = "y"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L26
            r4.skipValue()
            goto L5
        L26:
            float r1 = xt(r4)
            goto L5
        L2b:
            float r0 = xt(r4)
            goto L5
        L30:
            r4.endObject()
            android.graphics.PointF r4 = new android.graphics.PointF
            float r0 = r0 * r5
            float r1 = r1 * r5
            r4.<init>(r0, r1)
            return r4
    }

    static float xt(android.util.JsonReader r3) throws java.io.IOException {
            android.util.JsonToken r0 = r3.peek()
            int[] r1 = com.bytedance.adsdk.lottie.r.mi.AnonymousClass1.j
            int r2 = r0.ordinal()
            r1 = r1[r2]
            r2 = 1
            if (r1 == r2) goto L38
            r2 = 2
            if (r1 != r2) goto L28
            r3.beginArray()
            double r0 = r3.nextDouble()
            float r0 = (float) r0
        L1a:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L24
            r3.skipValue()
            goto L1a
        L24:
            r3.endArray()
            return r0
        L28:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unknown value for token of type "
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r0 = r1.concat(r0)
            r3.<init>(r0)
            throw r3
        L38:
            double r0 = r3.nextDouble()
            float r3 = (float) r0
            return r3
    }

    static android.graphics.PointF xt(android.util.JsonReader r2, float r3) throws java.io.IOException {
            int[] r0 = com.bytedance.adsdk.lottie.r.mi.AnonymousClass1.j
            android.util.JsonToken r1 = r2.peek()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L37
            r1 = 2
            if (r0 == r1) goto L32
            r1 = 3
            if (r0 != r1) goto L1a
            android.graphics.PointF r2 = up(r2, r3)
            return r2
        L1a:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unknown point starts with "
            r0.<init>(r1)
            android.util.JsonToken r2 = r2.peek()
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r3.<init>(r2)
            throw r3
        L32:
            android.graphics.PointF r2 = r(r2, r3)
            return r2
        L37:
            android.graphics.PointF r2 = cw(r2, r3)
            return r2
    }
}
