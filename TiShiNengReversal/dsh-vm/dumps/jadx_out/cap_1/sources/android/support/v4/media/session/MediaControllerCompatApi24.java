package android.support.v4.media.session;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(24)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class MediaControllerCompatApi24 {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class TransportControls {
        private TransportControls() {
                r0 = this;
                r0.<init>()
                return
        }

        public static void prepare(java.lang.Object r0) {
                android.media.session.MediaController$TransportControls r0 = (android.media.session.MediaController.TransportControls) r0
                android.support.v4.media.session.b.a(r0)
                return
        }

        public static void prepareFromMediaId(java.lang.Object r0, java.lang.String r1, android.os.Bundle r2) {
                android.media.session.MediaController$TransportControls r0 = (android.media.session.MediaController.TransportControls) r0
                android.support.v4.media.session.c.a(r0, r1, r2)
                return
        }

        public static void prepareFromSearch(java.lang.Object r0, java.lang.String r1, android.os.Bundle r2) {
                android.media.session.MediaController$TransportControls r0 = (android.media.session.MediaController.TransportControls) r0
                android.support.v4.media.session.e.a(r0, r1, r2)
                return
        }

        public static void prepareFromUri(java.lang.Object r0, android.net.Uri r1, android.os.Bundle r2) {
                android.media.session.MediaController$TransportControls r0 = (android.media.session.MediaController.TransportControls) r0
                android.support.v4.media.session.d.a(r0, r1, r2)
                return
        }
    }

    private MediaControllerCompatApi24() {
            r0 = this;
            r0.<init>()
            return
    }
}
