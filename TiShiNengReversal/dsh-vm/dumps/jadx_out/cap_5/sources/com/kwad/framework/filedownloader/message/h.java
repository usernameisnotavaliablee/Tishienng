package com.kwad.framework.filedownloader.message;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public abstract class h extends com.kwad.framework.filedownloader.message.MessageSnapshot {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class a extends com.kwad.framework.filedownloader.message.h.b implements com.kwad.framework.filedownloader.message.b {
        a(int r1, boolean r2, int r3) {
                r0 = this;
                r2 = 1
                r0.<init>(r1, r2, r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class b extends com.kwad.framework.filedownloader.message.h {
        private final boolean aoF;
        private final int aoT;

        b(int r1, boolean r2, int r3) {
                r0 = this;
                r0.<init>(r1)
                r0.aoF = r2
                r0.aoT = r3
                return
        }

        b(android.os.Parcel r2) {
                r1 = this;
                r1.<init>(r2)
                byte r0 = r2.readByte()
                if (r0 == 0) goto Lb
                r0 = 1
                goto Lc
            Lb:
                r0 = 0
            Lc:
                r1.aoF = r0
                int r2 = r2.readInt()
                r1.aoT = r2
                return
        }

        @Override // com.kwad.framework.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public int describeContents() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // com.kwad.framework.filedownloader.message.c
        public final byte wJ() {
                r1 = this;
                r0 = -3
                return r0
        }

        @Override // com.kwad.framework.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public void writeToParcel(android.os.Parcel r1, int r2) {
                r0 = this;
                super.writeToParcel(r1, r2)
                boolean r2 = r0.aoF
                r1.writeByte(r2)
                int r2 = r0.aoT
                r1.writeInt(r2)
                return
        }

        @Override // com.kwad.framework.filedownloader.message.MessageSnapshot
        public final int yN() {
                r1 = this;
                int r0 = r1.aoT
                return r0
        }

        @Override // com.kwad.framework.filedownloader.message.MessageSnapshot
        public final boolean yP() {
                r1 = this;
                boolean r0 = r1.aoF
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class c extends com.kwad.framework.filedownloader.message.h {
        private final java.lang.String anc;
        private final boolean aoG;
        private final int aoT;
        private final java.lang.String fileName;

        c(int r1, boolean r2, int r3, java.lang.String r4, java.lang.String r5) {
                r0 = this;
                r0.<init>(r1)
                r0.aoG = r2
                r0.aoT = r3
                r0.anc = r4
                r0.fileName = r5
                return
        }

        c(android.os.Parcel r2) {
                r1 = this;
                r1.<init>(r2)
                byte r0 = r2.readByte()
                if (r0 == 0) goto Lb
                r0 = 1
                goto Lc
            Lb:
                r0 = 0
            Lc:
                r1.aoG = r0
                int r0 = r2.readInt()
                r1.aoT = r0
                java.lang.String r0 = r2.readString()
                r1.anc = r0
                java.lang.String r2 = r2.readString()
                r1.fileName = r2
                return
        }

        @Override // com.kwad.framework.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public final int describeContents() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // com.kwad.framework.filedownloader.message.MessageSnapshot
        public final java.lang.String getEtag() {
                r1 = this;
                java.lang.String r0 = r1.anc
                return r0
        }

        @Override // com.kwad.framework.filedownloader.message.MessageSnapshot
        public final java.lang.String getFileName() {
                r1 = this;
                java.lang.String r0 = r1.fileName
                return r0
        }

        @Override // com.kwad.framework.filedownloader.message.c
        public final byte wJ() {
                r1 = this;
                r0 = 2
                return r0
        }

        @Override // com.kwad.framework.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public final void writeToParcel(android.os.Parcel r1, int r2) {
                r0 = this;
                super.writeToParcel(r1, r2)
                boolean r2 = r0.aoG
                r1.writeByte(r2)
                int r2 = r0.aoT
                r1.writeInt(r2)
                java.lang.String r2 = r0.anc
                r1.writeString(r2)
                java.lang.String r2 = r0.fileName
                r1.writeString(r2)
                return
        }

        @Override // com.kwad.framework.filedownloader.message.MessageSnapshot
        public final boolean yE() {
                r1 = this;
                boolean r0 = r1.aoG
                return r0
        }

        @Override // com.kwad.framework.filedownloader.message.MessageSnapshot
        public final int yN() {
                r1 = this;
                int r0 = r1.aoT
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class d extends com.kwad.framework.filedownloader.message.h {
        private final java.lang.Throwable aoI;
        private final int aoU;

        d(int r1, int r2, java.lang.Throwable r3) {
                r0 = this;
                r0.<init>(r1)
                r0.aoU = r2
                r0.aoI = r3
                return
        }

        d(android.os.Parcel r2) {
                r1 = this;
                r1.<init>(r2)
                int r0 = r2.readInt()
                r1.aoU = r0
                java.io.Serializable r2 = r2.readSerializable()
                java.lang.Throwable r2 = (java.lang.Throwable) r2
                r1.aoI = r2
                return
        }

        @Override // com.kwad.framework.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public int describeContents() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // com.kwad.framework.filedownloader.message.c
        public byte wJ() {
                r1 = this;
                r0 = -1
                return r0
        }

        @Override // com.kwad.framework.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public void writeToParcel(android.os.Parcel r1, int r2) {
                r0 = this;
                super.writeToParcel(r1, r2)
                int r2 = r0.aoU
                r1.writeInt(r2)
                java.lang.Throwable r2 = r0.aoI
                r1.writeSerializable(r2)
                return
        }

        @Override // com.kwad.framework.filedownloader.message.MessageSnapshot
        public final int yM() {
                r1 = this;
                int r0 = r1.aoU
                return r0
        }

        @Override // com.kwad.framework.filedownloader.message.MessageSnapshot
        public final java.lang.Throwable yR() {
                r1 = this;
                java.lang.Throwable r0 = r1.aoI
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class e extends com.kwad.framework.filedownloader.message.h.f {
        e(int r1, int r2, int r3) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                return
        }

        @Override // com.kwad.framework.filedownloader.message.h.f, com.kwad.framework.filedownloader.message.c
        public final byte wJ() {
                r1 = this;
                r0 = -2
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class f extends com.kwad.framework.filedownloader.message.h {
        private final int aoT;
        private final int aoU;

        f(int r1, int r2, int r3) {
                r0 = this;
                r0.<init>(r1)
                r0.aoU = r2
                r0.aoT = r3
                return
        }

        f(android.os.Parcel r2) {
                r1 = this;
                r1.<init>(r2)
                int r0 = r2.readInt()
                r1.aoU = r0
                int r2 = r2.readInt()
                r1.aoT = r2
                return
        }

        f(com.kwad.framework.filedownloader.message.h.f r3) {
                r2 = this;
                int r0 = r3.getId()
                int r1 = r3.yM()
                int r3 = r3.yN()
                r2.<init>(r0, r1, r3)
                return
        }

        public byte wJ() {
                r1 = this;
                r0 = 1
                return r0
        }

        @Override // com.kwad.framework.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public void writeToParcel(android.os.Parcel r1, int r2) {
                r0 = this;
                super.writeToParcel(r1, r2)
                int r2 = r0.aoU
                r1.writeInt(r2)
                int r2 = r0.aoT
                r1.writeInt(r2)
                return
        }

        @Override // com.kwad.framework.filedownloader.message.MessageSnapshot
        public final int yM() {
                r1 = this;
                int r0 = r1.aoU
                return r0
        }

        @Override // com.kwad.framework.filedownloader.message.MessageSnapshot
        public final int yN() {
                r1 = this;
                int r0 = r1.aoT
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class g extends com.kwad.framework.filedownloader.message.h {
        private final int aoU;

        g(int r1, int r2) {
                r0 = this;
                r0.<init>(r1)
                r0.aoU = r2
                return
        }

        g(android.os.Parcel r1) {
                r0 = this;
                r0.<init>(r1)
                int r1 = r1.readInt()
                r0.aoU = r1
                return
        }

        @Override // com.kwad.framework.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public final int describeContents() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // com.kwad.framework.filedownloader.message.c
        public final byte wJ() {
                r1 = this;
                r0 = 3
                return r0
        }

        @Override // com.kwad.framework.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public final void writeToParcel(android.os.Parcel r1, int r2) {
                r0 = this;
                super.writeToParcel(r1, r2)
                int r2 = r0.aoU
                r1.writeInt(r2)
                return
        }

        @Override // com.kwad.framework.filedownloader.message.MessageSnapshot
        public final int yM() {
                r1 = this;
                int r0 = r1.aoU
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.kwad.framework.filedownloader.message.h$h, reason: collision with other inner class name */
    public static class C0119h extends com.kwad.framework.filedownloader.message.h.d {
        private final int aon;

        C0119h(int r1, int r2, java.lang.Throwable r3, int r4) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                r0.aon = r4
                return
        }

        C0119h(android.os.Parcel r1) {
                r0 = this;
                r0.<init>(r1)
                int r1 = r1.readInt()
                r0.aon = r1
                return
        }

        @Override // com.kwad.framework.filedownloader.message.h.d, com.kwad.framework.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public final int describeContents() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // com.kwad.framework.filedownloader.message.h.d, com.kwad.framework.filedownloader.message.c
        public final byte wJ() {
                r1 = this;
                r0 = 5
                return r0
        }

        @Override // com.kwad.framework.filedownloader.message.MessageSnapshot
        public final int wN() {
                r1 = this;
                int r0 = r1.aon
                return r0
        }

        @Override // com.kwad.framework.filedownloader.message.h.d, com.kwad.framework.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public final void writeToParcel(android.os.Parcel r1, int r2) {
                r0 = this;
                super.writeToParcel(r1, r2)
                int r2 = r0.aon
                r1.writeInt(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class i extends com.kwad.framework.filedownloader.message.h.j implements com.kwad.framework.filedownloader.message.b {
        i(int r1, int r2, int r3) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class j extends com.kwad.framework.filedownloader.message.h.f implements com.kwad.framework.filedownloader.message.MessageSnapshot.a {
        j(int r1, int r2, int r3) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                return
        }

        j(android.os.Parcel r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.kwad.framework.filedownloader.message.h.f, com.kwad.framework.filedownloader.message.c
        public final byte wJ() {
                r1 = this;
                r0 = -4
                return r0
        }

        @Override // com.kwad.framework.filedownloader.message.MessageSnapshot.a
        public final com.kwad.framework.filedownloader.message.MessageSnapshot yS() {
                r1 = this;
                com.kwad.framework.filedownloader.message.h$f r0 = new com.kwad.framework.filedownloader.message.h$f
                r0.<init>(r1)
                return r0
        }
    }

    h(int r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 0
            r0.aoJ = r1
            return
    }

    h(android.os.Parcel r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // com.kwad.framework.filedownloader.message.MessageSnapshot
    public final long yO() {
            r2 = this;
            int r0 = r2.yN()
            long r0 = (long) r0
            return r0
    }

    @Override // com.kwad.framework.filedownloader.message.MessageSnapshot
    public final long yQ() {
            r2 = this;
            int r0 = r2.yM()
            long r0 = (long) r0
            return r0
    }
}
