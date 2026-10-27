package com.kwad.framework.filedownloader.message;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public abstract class MessageSnapshot implements android.os.Parcelable, com.kwad.framework.filedownloader.message.c {
    public static final android.os.Parcelable.Creator<com.kwad.framework.filedownloader.message.MessageSnapshot> CREATOR = null;
    protected boolean aoJ;
    private final int id;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class NoFieldException extends java.lang.IllegalStateException {
        NoFieldException(java.lang.String r5, com.kwad.framework.filedownloader.message.MessageSnapshot r6) {
                r4 = this;
                int r0 = r6.getId()
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                byte r1 = r6.wJ()
                java.lang.Byte r1 = java.lang.Byte.valueOf(r1)
                java.lang.Class r6 = r6.getClass()
                java.lang.String r6 = r6.getName()
                r2 = 4
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = 0
                r2[r3] = r5
                r5 = 1
                r2[r5] = r0
                r5 = 2
                r2[r5] = r1
                r5 = 3
                r2[r5] = r6
                java.lang.String r5 = "There isn't a field for '%s' in this message %d %d %s"
                java.lang.String r5 = com.kwad.framework.filedownloader.f.f.c(r5, r2)
                r4.<init>(r5)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface a {
        com.kwad.framework.filedownloader.message.MessageSnapshot yS();
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class b extends com.kwad.framework.filedownloader.message.MessageSnapshot {
        b(int r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        b(android.os.Parcel r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.kwad.framework.filedownloader.message.c
        public final byte wJ() {
                r1 = this;
                r0 = 6
                return r0
        }
    }

    static {
            com.kwad.framework.filedownloader.message.MessageSnapshot$1 r0 = new com.kwad.framework.filedownloader.message.MessageSnapshot$1
            r0.<init>()
            com.kwad.framework.filedownloader.message.MessageSnapshot.CREATOR = r0
            return
    }

    MessageSnapshot(int r1) {
            r0 = this;
            r0.<init>()
            r0.id = r1
            return
    }

    MessageSnapshot(android.os.Parcel r1) {
            r0 = this;
            r0.<init>()
            int r1 = r1.readInt()
            r0.id = r1
            return
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public java.lang.String getEtag() {
            r2 = this;
            com.kwad.framework.filedownloader.message.MessageSnapshot$NoFieldException r0 = new com.kwad.framework.filedownloader.message.MessageSnapshot$NoFieldException
            java.lang.String r1 = "getEtag"
            r0.<init>(r1, r2)
            throw r0
    }

    public java.lang.String getFileName() {
            r2 = this;
            com.kwad.framework.filedownloader.message.MessageSnapshot$NoFieldException r0 = new com.kwad.framework.filedownloader.message.MessageSnapshot$NoFieldException
            java.lang.String r1 = "getFileName"
            r0.<init>(r1, r2)
            throw r0
    }

    public final int getId() {
            r1 = this;
            int r0 = r1.id
            return r0
    }

    public int wN() {
            r2 = this;
            com.kwad.framework.filedownloader.message.MessageSnapshot$NoFieldException r0 = new com.kwad.framework.filedownloader.message.MessageSnapshot$NoFieldException
            java.lang.String r1 = "getRetryingTimes"
            r0.<init>(r1, r2)
            throw r0
    }

    public final boolean wP() {
            r1 = this;
            boolean r0 = r1.aoJ
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            boolean r2 = r0.aoJ
            byte r2 = (byte) r2
            r1.writeByte(r2)
            byte r2 = r0.wJ()
            r1.writeByte(r2)
            int r2 = r0.id
            r1.writeInt(r2)
            return
    }

    public boolean yE() {
            r2 = this;
            com.kwad.framework.filedownloader.message.MessageSnapshot$NoFieldException r0 = new com.kwad.framework.filedownloader.message.MessageSnapshot$NoFieldException
            java.lang.String r1 = "isResuming"
            r0.<init>(r1, r2)
            throw r0
    }

    public int yM() {
            r2 = this;
            com.kwad.framework.filedownloader.message.MessageSnapshot$NoFieldException r0 = new com.kwad.framework.filedownloader.message.MessageSnapshot$NoFieldException
            java.lang.String r1 = "getSmallSofarBytes"
            r0.<init>(r1, r2)
            throw r0
    }

    public int yN() {
            r2 = this;
            com.kwad.framework.filedownloader.message.MessageSnapshot$NoFieldException r0 = new com.kwad.framework.filedownloader.message.MessageSnapshot$NoFieldException
            java.lang.String r1 = "getSmallTotalBytes"
            r0.<init>(r1, r2)
            throw r0
    }

    public long yO() {
            r2 = this;
            com.kwad.framework.filedownloader.message.MessageSnapshot$NoFieldException r0 = new com.kwad.framework.filedownloader.message.MessageSnapshot$NoFieldException
            java.lang.String r1 = "getLargeTotalBytes"
            r0.<init>(r1, r2)
            throw r0
    }

    public boolean yP() {
            r2 = this;
            com.kwad.framework.filedownloader.message.MessageSnapshot$NoFieldException r0 = new com.kwad.framework.filedownloader.message.MessageSnapshot$NoFieldException
            java.lang.String r1 = "isReusedDownloadedFile"
            r0.<init>(r1, r2)
            throw r0
    }

    public long yQ() {
            r2 = this;
            com.kwad.framework.filedownloader.message.MessageSnapshot$NoFieldException r0 = new com.kwad.framework.filedownloader.message.MessageSnapshot$NoFieldException
            java.lang.String r1 = "getLargeSofarBytes"
            r0.<init>(r1, r2)
            throw r0
    }

    public java.lang.Throwable yR() {
            r2 = this;
            com.kwad.framework.filedownloader.message.MessageSnapshot$NoFieldException r0 = new com.kwad.framework.filedownloader.message.MessageSnapshot$NoFieldException
            java.lang.String r1 = "getThrowable"
            r0.<init>(r1, r2)
            throw r0
    }
}
