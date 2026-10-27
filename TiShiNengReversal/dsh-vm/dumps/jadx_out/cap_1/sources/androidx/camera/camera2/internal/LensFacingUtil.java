package androidx.camera.camera2.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class LensFacingUtil {
    private LensFacingUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.OptIn(markerClass = {androidx.camera.core.ExperimentalLensFacing.class})
    public static int getCameraSelectorLensFacing(int r3) {
            if (r3 == 0) goto L26
            r0 = 1
            if (r3 == r0) goto L25
            r0 = 2
            if (r3 != r0) goto L9
            return r0
        L9:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "The given lens facing integer: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = " can not be recognized."
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        L25:
            return r0
        L26:
            r3 = 0
            return r3
    }

    @androidx.annotation.OptIn(markerClass = {androidx.camera.core.ExperimentalLensFacing.class})
    public static int getLensFacingInt(int r3) {
            if (r3 == 0) goto L26
            r0 = 1
            if (r3 == r0) goto L25
            r0 = 2
            if (r3 != r0) goto L9
            return r0
        L9:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "The given lens facing: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = " can not be recognized."
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        L25:
            return r0
        L26:
            r3 = 0
            return r3
    }
}
