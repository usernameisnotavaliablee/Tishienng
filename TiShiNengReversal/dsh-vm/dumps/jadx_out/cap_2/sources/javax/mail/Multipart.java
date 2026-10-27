package javax.mail;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class Multipart {
    protected java.lang.String contentType;
    protected javax.mail.Part parent;
    protected java.util.Vector parts;

    protected Multipart() {
            r1 = this;
            r1.<init>()
            java.util.Vector r0 = new java.util.Vector
            r0.<init>()
            r1.parts = r0
            java.lang.String r0 = "multipart/mixed"
            r1.contentType = r0
            return
    }

    public synchronized void addBodyPart(javax.mail.BodyPart r2) throws javax.mail.MessagingException {
            r1 = this;
            monitor-enter(r1)
            java.util.Vector r0 = r1.parts     // Catch: java.lang.Throwable -> Ld
            if (r0 != 0) goto Lf
            java.util.Vector r0 = new java.util.Vector     // Catch: java.lang.Throwable -> Ld
            r0.<init>()     // Catch: java.lang.Throwable -> Ld
            r1.parts = r0     // Catch: java.lang.Throwable -> Ld
            goto Lf
        Ld:
            r2 = move-exception
            goto L19
        Lf:
            java.util.Vector r0 = r1.parts     // Catch: java.lang.Throwable -> Ld
            r0.addElement(r2)     // Catch: java.lang.Throwable -> Ld
            r2.setParent(r1)     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r1)
            return
        L19:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Ld
            throw r2
    }

    public synchronized void addBodyPart(javax.mail.BodyPart r2, int r3) throws javax.mail.MessagingException {
            r1 = this;
            monitor-enter(r1)
            java.util.Vector r0 = r1.parts     // Catch: java.lang.Throwable -> Ld
            if (r0 != 0) goto Lf
            java.util.Vector r0 = new java.util.Vector     // Catch: java.lang.Throwable -> Ld
            r0.<init>()     // Catch: java.lang.Throwable -> Ld
            r1.parts = r0     // Catch: java.lang.Throwable -> Ld
            goto Lf
        Ld:
            r2 = move-exception
            goto L19
        Lf:
            java.util.Vector r0 = r1.parts     // Catch: java.lang.Throwable -> Ld
            r0.insertElementAt(r2, r3)     // Catch: java.lang.Throwable -> Ld
            r2.setParent(r1)     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r1)
            return
        L19:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Ld
            throw r2
    }

    public synchronized javax.mail.BodyPart getBodyPart(int r2) throws javax.mail.MessagingException {
            r1 = this;
            monitor-enter(r1)
            java.util.Vector r0 = r1.parts     // Catch: java.lang.Throwable -> Ld
            if (r0 == 0) goto Lf
            java.lang.Object r2 = r0.elementAt(r2)     // Catch: java.lang.Throwable -> Ld
            javax.mail.BodyPart r2 = (javax.mail.BodyPart) r2     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r1)
            return r2
        Ld:
            r2 = move-exception
            goto L17
        Lf:
            java.lang.IndexOutOfBoundsException r2 = new java.lang.IndexOutOfBoundsException     // Catch: java.lang.Throwable -> Ld
            java.lang.String r0 = "No such BodyPart"
            r2.<init>(r0)     // Catch: java.lang.Throwable -> Ld
            throw r2     // Catch: java.lang.Throwable -> Ld
        L17:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Ld
            throw r2
    }

    public java.lang.String getContentType() {
            r1 = this;
            java.lang.String r0 = r1.contentType
            return r0
    }

    public synchronized int getCount() throws javax.mail.MessagingException {
            r1 = this;
            monitor-enter(r1)
            java.util.Vector r0 = r1.parts     // Catch: java.lang.Throwable -> Le
            if (r0 != 0) goto L8
            monitor-exit(r1)
            r0 = 0
            return r0
        L8:
            int r0 = r0.size()     // Catch: java.lang.Throwable -> Le
            monitor-exit(r1)
            return r0
        Le:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Le
            throw r0
    }

    public synchronized javax.mail.Part getParent() {
            r1 = this;
            monitor-enter(r1)
            javax.mail.Part r0 = r1.parent     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5
            throw r0
    }

    public synchronized void removeBodyPart(int r3) throws javax.mail.MessagingException {
            r2 = this;
            monitor-enter(r2)
            java.util.Vector r0 = r2.parts     // Catch: java.lang.Throwable -> L16
            if (r0 == 0) goto L18
            java.lang.Object r0 = r0.elementAt(r3)     // Catch: java.lang.Throwable -> L16
            javax.mail.BodyPart r0 = (javax.mail.BodyPart) r0     // Catch: java.lang.Throwable -> L16
            java.util.Vector r1 = r2.parts     // Catch: java.lang.Throwable -> L16
            r1.removeElementAt(r3)     // Catch: java.lang.Throwable -> L16
            r3 = 0
            r0.setParent(r3)     // Catch: java.lang.Throwable -> L16
            monitor-exit(r2)
            return
        L16:
            r3 = move-exception
            goto L20
        L18:
            java.lang.IndexOutOfBoundsException r3 = new java.lang.IndexOutOfBoundsException     // Catch: java.lang.Throwable -> L16
            java.lang.String r0 = "No such BodyPart"
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L16
            throw r3     // Catch: java.lang.Throwable -> L16
        L20:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L16
            throw r3
    }

    public synchronized boolean removeBodyPart(javax.mail.BodyPart r3) throws javax.mail.MessagingException {
            r2 = this;
            monitor-enter(r2)
            java.util.Vector r0 = r2.parts     // Catch: java.lang.Throwable -> Lf
            if (r0 == 0) goto L11
            boolean r0 = r0.removeElement(r3)     // Catch: java.lang.Throwable -> Lf
            r1 = 0
            r3.setParent(r1)     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r2)
            return r0
        Lf:
            r3 = move-exception
            goto L19
        L11:
            javax.mail.MessagingException r3 = new javax.mail.MessagingException     // Catch: java.lang.Throwable -> Lf
            java.lang.String r0 = "No such body part"
            r3.<init>(r0)     // Catch: java.lang.Throwable -> Lf
            throw r3     // Catch: java.lang.Throwable -> Lf
        L19:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lf
            throw r3
    }

    protected synchronized void setMultipartDataSource(javax.mail.MultipartDataSource r4) throws javax.mail.MessagingException {
            r3 = this;
            monitor-enter(r3)
            java.lang.String r0 = r4.getContentType()     // Catch: java.lang.Throwable -> L1a
            r3.contentType = r0     // Catch: java.lang.Throwable -> L1a
            int r0 = r4.getCount()     // Catch: java.lang.Throwable -> L1a
            r1 = 0
        Lc:
            if (r1 < r0) goto L10
            monitor-exit(r3)
            return
        L10:
            javax.mail.BodyPart r2 = r4.getBodyPart(r1)     // Catch: java.lang.Throwable -> L1a
            r3.addBodyPart(r2)     // Catch: java.lang.Throwable -> L1a
            int r1 = r1 + 1
            goto Lc
        L1a:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1a
            throw r4
    }

    public synchronized void setParent(javax.mail.Part r1) {
            r0 = this;
            monitor-enter(r0)
            r0.parent = r1     // Catch: java.lang.Throwable -> L5
            monitor-exit(r0)
            return
        L5:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5
            throw r1
    }

    public abstract void writeTo(java.io.OutputStream r1) throws java.io.IOException, javax.mail.MessagingException;
}
