package androidx.camera.video.internal.audio;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class AudioUtils {
    private AudioUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int channelCountToChannelConfig(int r1) {
            r0 = 1
            if (r1 != r0) goto L6
            r1 = 16
            return r1
        L6:
            r1 = 12
            return r1
    }

    public static int channelCountToChannelMask(int r1) {
            r0 = 1
            if (r1 != r0) goto L6
            r1 = 16
            return r1
        L6:
            r1 = 12
            return r1
    }

    public static long frameCountToDurationNs(long r4, int r6) {
            long r0 = (long) r6
            r2 = 0
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 <= 0) goto L9
            r6 = 1
            goto La
        L9:
            r6 = 0
        La:
            java.lang.String r2 = "sampleRate must be greater than 0."
            androidx.core.util.Preconditions.checkArgument(r6, r2)
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS
            r2 = 1
            long r2 = r6.toNanos(r2)
            long r2 = r2 * r4
            long r2 = r2 / r0
            return r2
    }

    public static long frameCountToSize(long r4, int r6) {
            long r0 = (long) r6
            r2 = 0
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 <= 0) goto L9
            r6 = 1
            goto La
        L9:
            r6 = 0
        La:
            java.lang.String r2 = "bytesPerFrame must be greater than 0."
            androidx.core.util.Preconditions.checkArgument(r6, r2)
            long r4 = r4 * r0
            return r4
    }

    public static int getBytesPerFrame(int r3, int r4) {
            if (r4 <= 0) goto L4
            r0 = 1
            goto L5
        L4:
            r0 = 0
        L5:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid channel count: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            androidx.core.util.Preconditions.checkArgument(r0, r1)
            r0 = 2
            if (r3 == r0) goto L48
            r0 = 3
            if (r3 == r0) goto L47
            r1 = 4
            if (r3 == r1) goto L45
            r2 = 21
            if (r3 == r2) goto L42
            r0 = 22
            if (r3 != r0) goto L2b
            goto L45
        L2b:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid audio encoding: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
            throw r4
        L42:
            int r4 = r4 * 3
            return r4
        L45:
            int r4 = r4 * 4
        L47:
            return r4
        L48:
            int r4 = r4 * 2
            return r4
    }

    public static long sizeToFrameCount(long r4, int r6) {
            long r0 = (long) r6
            r2 = 0
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 <= 0) goto L9
            r6 = 1
            goto La
        L9:
            r6 = 0
        La:
            java.lang.String r2 = "bytesPerFrame must be greater than 0."
            androidx.core.util.Preconditions.checkArgument(r6, r2)
            long r4 = r4 / r0
            return r4
    }
}
