package androidx.media;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(28)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class MediaSessionManagerImplApi28 extends androidx.media.MediaSessionManagerImplApi21 {
    android.media.session.MediaSessionManager mObject;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class RemoteUserInfoImplApi28 implements androidx.media.MediaSessionManager.RemoteUserInfoImpl {
        final android.media.session.MediaSessionManager.RemoteUserInfo mObject;

        RemoteUserInfoImplApi28(android.media.session.MediaSessionManager.RemoteUserInfo r1) {
                r0 = this;
                r0.<init>()
                r0.mObject = r1
                return
        }

        RemoteUserInfoImplApi28(java.lang.String r1, int r2, int r3) {
                r0 = this;
                r0.<init>()
                android.media.session.MediaSessionManager$RemoteUserInfo r1 = androidx.media.j.a(r1, r2, r3)
                r0.mObject = r1
                return
        }

        public boolean equals(java.lang.Object r2) {
                r1 = this;
                if (r1 != r2) goto L4
                r2 = 1
                return r2
            L4:
                boolean r0 = r2 instanceof androidx.media.MediaSessionManagerImplApi28.RemoteUserInfoImplApi28
                if (r0 != 0) goto La
                r2 = 0
                return r2
            La:
                androidx.media.MediaSessionManagerImplApi28$RemoteUserInfoImplApi28 r2 = (androidx.media.MediaSessionManagerImplApi28.RemoteUserInfoImplApi28) r2
                android.media.session.MediaSessionManager$RemoteUserInfo r0 = r1.mObject
                android.media.session.MediaSessionManager$RemoteUserInfo r2 = r2.mObject
                boolean r2 = androidx.media.g.a(r0, r2)
                return r2
        }

        @Override // androidx.media.MediaSessionManager.RemoteUserInfoImpl
        public java.lang.String getPackageName() {
                r1 = this;
                android.media.session.MediaSessionManager$RemoteUserInfo r0 = r1.mObject
                java.lang.String r0 = androidx.media.i.a(r0)
                return r0
        }

        @Override // androidx.media.MediaSessionManager.RemoteUserInfoImpl
        public int getPid() {
                r1 = this;
                android.media.session.MediaSessionManager$RemoteUserInfo r0 = r1.mObject
                int r0 = androidx.media.f.a(r0)
                return r0
        }

        @Override // androidx.media.MediaSessionManager.RemoteUserInfoImpl
        public int getUid() {
                r1 = this;
                android.media.session.MediaSessionManager$RemoteUserInfo r0 = r1.mObject
                int r0 = androidx.media.h.a(r0)
                return r0
        }

        public int hashCode() {
                r3 = this;
                android.media.session.MediaSessionManager$RemoteUserInfo r0 = r3.mObject
                r1 = 1
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r2 = 0
                r1[r2] = r0
                int r0 = androidx.core.util.ObjectsCompat.hash(r1)
                return r0
        }
    }

    MediaSessionManagerImplApi28(android.content.Context r2) {
            r1 = this;
            r1.<init>(r2)
            java.lang.String r0 = "media_session"
            java.lang.Object r2 = r2.getSystemService(r0)
            android.media.session.MediaSessionManager r2 = (android.media.session.MediaSessionManager) r2
            r1.mObject = r2
            return
    }

    @Override // androidx.media.MediaSessionManagerImplApi21, androidx.media.MediaSessionManagerImplBase, androidx.media.MediaSessionManager.MediaSessionManagerImpl
    public boolean isTrustedForMediaControl(androidx.media.MediaSessionManager.RemoteUserInfoImpl r2) {
            r1 = this;
            boolean r0 = r2 instanceof androidx.media.MediaSessionManagerImplApi28.RemoteUserInfoImplApi28
            if (r0 == 0) goto Lf
            android.media.session.MediaSessionManager r0 = r1.mObject
            androidx.media.MediaSessionManagerImplApi28$RemoteUserInfoImplApi28 r2 = (androidx.media.MediaSessionManagerImplApi28.RemoteUserInfoImplApi28) r2
            android.media.session.MediaSessionManager$RemoteUserInfo r2 = r2.mObject
            boolean r2 = androidx.media.e.a(r0, r2)
            return r2
        Lf:
            r2 = 0
            return r2
    }
}
