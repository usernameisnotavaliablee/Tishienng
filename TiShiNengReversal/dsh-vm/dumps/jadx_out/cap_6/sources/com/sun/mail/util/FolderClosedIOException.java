package com.sun.mail.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class FolderClosedIOException extends java.io.IOException {
    private static final long serialVersionUID = 4281122580365555735L;
    private transient javax.mail.Folder folder;

    public FolderClosedIOException(javax.mail.Folder r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public FolderClosedIOException(javax.mail.Folder r1, java.lang.String r2) {
            r0 = this;
            r0.<init>(r2)
            r0.folder = r1
            return
    }

    public javax.mail.Folder getFolder() {
            r1 = this;
            javax.mail.Folder r0 = r1.folder
            return r0
    }
}
