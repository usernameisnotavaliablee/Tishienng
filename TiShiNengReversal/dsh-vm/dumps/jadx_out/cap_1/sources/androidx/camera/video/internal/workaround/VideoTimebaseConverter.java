package androidx.camera.video.internal.workaround;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class VideoTimebaseConverter {
    private static final java.lang.String TAG = "VideoTimebaseConverter";
    private androidx.camera.core.impl.Timebase mInputTimebase;
    private final androidx.camera.video.internal.encoder.TimeProvider mTimeProvider;
    private long mUptimeToRealtimeOffsetUs;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: androidx.camera.video.internal.workaround.VideoTimebaseConverter$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$androidx$camera$core$impl$Timebase = null;

        static {
                androidx.camera.core.impl.Timebase[] r0 = androidx.camera.core.impl.Timebase.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.camera.video.internal.workaround.VideoTimebaseConverter.AnonymousClass1.$SwitchMap$androidx$camera$core$impl$Timebase = r0
                androidx.camera.core.impl.Timebase r1 = androidx.camera.core.impl.Timebase.REALTIME     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = androidx.camera.video.internal.workaround.VideoTimebaseConverter.AnonymousClass1.$SwitchMap$androidx$camera$core$impl$Timebase     // Catch: java.lang.NoSuchFieldError -> L1d
                androidx.camera.core.impl.Timebase r1 = androidx.camera.core.impl.Timebase.UPTIME     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                return
        }
    }

    public VideoTimebaseConverter(@androidx.annotation.NonNull androidx.camera.video.internal.encoder.TimeProvider r3, @androidx.annotation.Nullable androidx.camera.core.impl.Timebase r4) {
            r2 = this;
            r2.<init>()
            r0 = -1
            r2.mUptimeToRealtimeOffsetUs = r0
            r2.mTimeProvider = r3
            r2.mInputTimebase = r4
            return
    }

    private long calculateUptimeToRealtimeOffsetUs() {
            r17 = this;
            r0 = r17
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r3 = 0
            r5 = 0
            r6 = r3
        Lb:
            r8 = 3
            if (r5 >= r8) goto L32
            androidx.camera.video.internal.encoder.TimeProvider r8 = r0.mTimeProvider
            long r8 = r8.uptimeUs()
            androidx.camera.video.internal.encoder.TimeProvider r10 = r0.mTimeProvider
            long r10 = r10.realtimeUs()
            androidx.camera.video.internal.encoder.TimeProvider r12 = r0.mTimeProvider
            long r12 = r12.uptimeUs()
            long r14 = r12 - r8
            if (r5 == 0) goto L28
            int r16 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r16 >= 0) goto L2f
        L28:
            long r8 = r8 + r12
            r1 = 1
            long r1 = r8 >> r1
            long r6 = r10 - r1
            r1 = r14
        L2f:
            int r5 = r5 + 1
            goto Lb
        L32:
            long r1 = java.lang.Math.max(r3, r6)
            return r1
    }

    private boolean isCloseToRealtime(long r5) {
            r4 = this;
            androidx.camera.video.internal.encoder.TimeProvider r0 = r4.mTimeProvider
            long r0 = r0.uptimeUs()
            androidx.camera.video.internal.encoder.TimeProvider r2 = r4.mTimeProvider
            long r2 = r2.realtimeUs()
            long r2 = r5 - r2
            long r2 = java.lang.Math.abs(r2)
            long r5 = r5 - r0
            long r5 = java.lang.Math.abs(r5)
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 >= 0) goto L1d
            r5 = 1
            return r5
        L1d:
            r5 = 0
            return r5
    }

    public long convertToUptimeUs(long r7) {
            r6 = this;
            androidx.camera.core.impl.Timebase r0 = r6.mInputTimebase
            java.lang.String r1 = "VideoTimebaseConverter"
            if (r0 != 0) goto L2b
            boolean r0 = r6.isCloseToRealtime(r7)
            if (r0 == 0) goto L11
            androidx.camera.core.impl.Timebase r0 = androidx.camera.core.impl.Timebase.REALTIME
            r6.mInputTimebase = r0
            goto L15
        L11:
            androidx.camera.core.impl.Timebase r0 = androidx.camera.core.impl.Timebase.UPTIME
            r6.mInputTimebase = r0
        L15:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Detect input timebase = "
            r0.append(r2)
            androidx.camera.core.impl.Timebase r2 = r6.mInputTimebase
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            androidx.camera.core.Logger.d(r1, r0)
        L2b:
            int[] r0 = androidx.camera.video.internal.workaround.VideoTimebaseConverter.AnonymousClass1.$SwitchMap$androidx$camera$core$impl$Timebase
            androidx.camera.core.impl.Timebase r2 = r6.mInputTimebase
            int r2 = r2.ordinal()
            r0 = r0[r2]
            r2 = 1
            if (r0 == r2) goto L55
            r1 = 2
            if (r0 != r1) goto L3c
            return r7
        L3c:
            java.lang.AssertionError r7 = new java.lang.AssertionError
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "Unknown timebase: "
            r8.append(r0)
            androidx.camera.core.impl.Timebase r0 = r6.mInputTimebase
            r8.append(r0)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        L55:
            long r2 = r6.mUptimeToRealtimeOffsetUs
            r4 = -1
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L79
            long r2 = r6.calculateUptimeToRealtimeOffsetUs()
            r6.mUptimeToRealtimeOffsetUs = r2
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "mUptimeToRealtimeOffsetUs = "
            r0.append(r2)
            long r2 = r6.mUptimeToRealtimeOffsetUs
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            androidx.camera.core.Logger.d(r1, r0)
        L79:
            long r0 = r6.mUptimeToRealtimeOffsetUs
            long r7 = r7 - r0
            return r7
    }
}
