package androidx.camera.core.processing;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class TargetUtils {
    private TargetUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void checkSupportedTargets(@androidx.annotation.NonNull java.util.Collection<java.lang.Integer> r4, int r5) {
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            boolean r0 = r4.contains(r0)
            java.util.Locale r1 = java.util.Locale.US
            java.lang.String r5 = getHumanReadableName(r5)
            java.lang.String r4 = getHumanReadableNames(r4)
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r5
            r5 = 1
            r2[r5] = r4
            java.lang.String r4 = "Effects target %s is not in the supported list %s."
            java.lang.String r4 = java.lang.String.format(r1, r4, r2)
            androidx.core.util.Preconditions.checkArgument(r0, r4)
            return
    }

    @androidx.annotation.NonNull
    public static java.lang.String getHumanReadableName(int r2) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = r2 & 4
            if (r1 == 0) goto Le
            java.lang.String r1 = "IMAGE_CAPTURE"
            r0.add(r1)
        Le:
            r1 = r2 & 1
            if (r1 == 0) goto L17
            java.lang.String r1 = "PREVIEW"
            r0.add(r1)
        L17:
            r2 = r2 & 2
            if (r2 == 0) goto L20
            java.lang.String r2 = "VIDEO_CAPTURE"
            r0.add(r2)
        L20:
            java.lang.String r2 = "|"
            java.lang.String r2 = androidx.camera.core.processing.j0.a(r2, r0)
            return r2
    }

    @androidx.annotation.NonNull
    private static java.lang.String getHumanReadableNames(@androidx.annotation.NonNull java.util.Collection<java.lang.Integer> r2) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r2 = r2.iterator()
        L9:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L21
            java.lang.Object r1 = r2.next()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            java.lang.String r1 = getHumanReadableName(r1)
            r0.add(r1)
            goto L9
        L21:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r1 = "["
            r2.append(r1)
            java.lang.String r1 = ", "
            java.lang.String r0 = androidx.camera.core.processing.j0.a(r1, r0)
            r2.append(r0)
            java.lang.String r0 = "]"
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            return r2
    }

    public static int getNumberOfTargets(int r2) {
            r0 = 0
        L1:
            if (r2 == 0) goto L9
            r1 = r2 & 1
            int r0 = r0 + r1
            int r2 = r2 >> 1
            goto L1
        L9:
            return r0
    }

    public static boolean isSuperset(int r0, int r1) {
            r0 = r0 & r1
            if (r0 != r1) goto L5
            r0 = 1
            return r0
        L5:
            r0 = 0
            return r0
    }
}
