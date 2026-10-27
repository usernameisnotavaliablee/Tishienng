package android.support.v4.media.session;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(22)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class PlaybackStateCompatApi22 {
    private PlaybackStateCompatApi22() {
            r0 = this;
            r0.<init>()
            return
    }

    public static android.os.Bundle getExtras(java.lang.Object r0) {
            android.media.session.PlaybackState r0 = (android.media.session.PlaybackState) r0
            android.os.Bundle r0 = android.support.v4.media.session.h.a(r0)
            return r0
    }

    public static java.lang.Object newInstance(int r7, long r8, long r10, float r12, long r13, java.lang.CharSequence r15, long r16, java.util.List<java.lang.Object> r18, long r19, android.os.Bundle r21) {
            android.media.session.PlaybackState$Builder r0 = new android.media.session.PlaybackState$Builder
            r0.<init>()
            r1 = r7
            r2 = r8
            r4 = r12
            r5 = r16
            r0.setState(r1, r2, r4, r5)
            r0.setBufferedPosition(r10)
            r0.setActions(r13)
            r0.setErrorMessage(r15)
            java.util.Iterator r7 = r18.iterator()
        L1a:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L2a
            java.lang.Object r8 = r7.next()
            android.media.session.PlaybackState$CustomAction r8 = (android.media.session.PlaybackState.CustomAction) r8
            r0.addCustomAction(r8)
            goto L1a
        L2a:
            r8 = r19
            r0.setActiveQueueItemId(r8)
            r7 = r21
            android.support.v4.media.session.i.a(r0, r7)
            android.media.session.PlaybackState r7 = r0.build()
            return r7
    }
}
