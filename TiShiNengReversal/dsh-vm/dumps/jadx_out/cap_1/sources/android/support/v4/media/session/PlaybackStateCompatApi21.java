package android.support.v4.media.session;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class PlaybackStateCompatApi21 {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class CustomAction {
        private CustomAction() {
                r0 = this;
                r0.<init>()
                return
        }

        public static java.lang.String getAction(java.lang.Object r0) {
                android.media.session.PlaybackState$CustomAction r0 = (android.media.session.PlaybackState.CustomAction) r0
                java.lang.String r0 = r0.getAction()
                return r0
        }

        public static android.os.Bundle getExtras(java.lang.Object r0) {
                android.media.session.PlaybackState$CustomAction r0 = (android.media.session.PlaybackState.CustomAction) r0
                android.os.Bundle r0 = r0.getExtras()
                return r0
        }

        public static int getIcon(java.lang.Object r0) {
                android.media.session.PlaybackState$CustomAction r0 = (android.media.session.PlaybackState.CustomAction) r0
                int r0 = r0.getIcon()
                return r0
        }

        public static java.lang.CharSequence getName(java.lang.Object r0) {
                android.media.session.PlaybackState$CustomAction r0 = (android.media.session.PlaybackState.CustomAction) r0
                java.lang.CharSequence r0 = r0.getName()
                return r0
        }

        public static java.lang.Object newInstance(java.lang.String r1, java.lang.CharSequence r2, int r3, android.os.Bundle r4) {
                android.media.session.PlaybackState$CustomAction$Builder r0 = new android.media.session.PlaybackState$CustomAction$Builder
                r0.<init>(r1, r2, r3)
                r0.setExtras(r4)
                android.media.session.PlaybackState$CustomAction r1 = r0.build()
                return r1
        }
    }

    private PlaybackStateCompatApi21() {
            r0 = this;
            r0.<init>()
            return
    }

    public static long getActions(java.lang.Object r2) {
            android.media.session.PlaybackState r2 = (android.media.session.PlaybackState) r2
            long r0 = r2.getActions()
            return r0
    }

    public static long getActiveQueueItemId(java.lang.Object r2) {
            android.media.session.PlaybackState r2 = (android.media.session.PlaybackState) r2
            long r0 = r2.getActiveQueueItemId()
            return r0
    }

    public static long getBufferedPosition(java.lang.Object r2) {
            android.media.session.PlaybackState r2 = (android.media.session.PlaybackState) r2
            long r0 = r2.getBufferedPosition()
            return r0
    }

    public static java.util.List<java.lang.Object> getCustomActions(java.lang.Object r0) {
            android.media.session.PlaybackState r0 = (android.media.session.PlaybackState) r0
            java.util.List r0 = r0.getCustomActions()
            return r0
    }

    public static java.lang.CharSequence getErrorMessage(java.lang.Object r0) {
            android.media.session.PlaybackState r0 = (android.media.session.PlaybackState) r0
            java.lang.CharSequence r0 = r0.getErrorMessage()
            return r0
    }

    public static long getLastPositionUpdateTime(java.lang.Object r2) {
            android.media.session.PlaybackState r2 = (android.media.session.PlaybackState) r2
            long r0 = r2.getLastPositionUpdateTime()
            return r0
    }

    public static float getPlaybackSpeed(java.lang.Object r0) {
            android.media.session.PlaybackState r0 = (android.media.session.PlaybackState) r0
            float r0 = r0.getPlaybackSpeed()
            return r0
    }

    public static long getPosition(java.lang.Object r2) {
            android.media.session.PlaybackState r2 = (android.media.session.PlaybackState) r2
            long r0 = r2.getPosition()
            return r0
    }

    public static int getState(java.lang.Object r0) {
            android.media.session.PlaybackState r0 = (android.media.session.PlaybackState) r0
            int r0 = r0.getState()
            return r0
    }

    public static java.lang.Object newInstance(int r7, long r8, long r10, float r12, long r13, java.lang.CharSequence r15, long r16, java.util.List<java.lang.Object> r18, long r19) {
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
            android.media.session.PlaybackState r7 = r0.build()
            return r7
    }
}
