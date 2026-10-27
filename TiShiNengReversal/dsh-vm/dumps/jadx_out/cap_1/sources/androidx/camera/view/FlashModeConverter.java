package androidx.camera.view;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class FlashModeConverter {
    private FlashModeConverter() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    public static java.lang.String nameOf(int r3) {
            if (r3 == 0) goto L25
            r0 = 1
            if (r3 == r0) goto L22
            r0 = 2
            if (r3 != r0) goto Lb
            java.lang.String r3 = "OFF"
            return r3
        Lb:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unknown flash mode "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        L22:
            java.lang.String r3 = "ON"
            return r3
        L25:
            java.lang.String r3 = "AUTO"
            return r3
    }

    public static int valueOf(@androidx.annotation.Nullable java.lang.String r5) {
            if (r5 == 0) goto L4b
            int r0 = r5.hashCode()
            r1 = 2
            r2 = 1
            r3 = 0
            r4 = -1
            switch(r0) {
                case 2527: goto L24;
                case 78159: goto L19;
                case 2020783: goto Le;
                default: goto Ld;
            }
        Ld:
            goto L2e
        Le:
            java.lang.String r0 = "AUTO"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L17
            goto L2e
        L17:
            r4 = 2
            goto L2e
        L19:
            java.lang.String r0 = "OFF"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L22
            goto L2e
        L22:
            r4 = 1
            goto L2e
        L24:
            java.lang.String r0 = "ON"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L2d
            goto L2e
        L2d:
            r4 = 0
        L2e:
            switch(r4) {
                case 0: goto L4a;
                case 1: goto L49;
                case 2: goto L48;
                default: goto L31;
            }
        L31:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unknown flash mode name "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            throw r0
        L48:
            return r3
        L49:
            return r1
        L4a:
            return r2
        L4b:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r0 = "name cannot be null"
            r5.<init>(r0)
            throw r5
    }
}
