package javax.mail;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class MessagingException extends java.lang.Exception {
    private static final long serialVersionUID = -7569192289819959253L;
    private java.lang.Exception next;

    public MessagingException() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.initCause(r0)
            return
    }

    public MessagingException(java.lang.String r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 0
            r0.initCause(r1)
            return
    }

    public MessagingException(java.lang.String r1, java.lang.Exception r2) {
            r0 = this;
            r0.<init>(r1)
            r0.next = r2
            r1 = 0
            r0.initCause(r1)
            return
    }

    private final java.lang.String superToString() {
            r1 = this;
            java.lang.String r0 = super.toString()
            return r0
    }

    @Override // java.lang.Throwable
    public synchronized java.lang.Throwable getCause() {
            r1 = this;
            monitor-enter(r1)
            java.lang.Exception r0 = r1.next     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5
            throw r0
    }

    public synchronized java.lang.Exception getNextException() {
            r1 = this;
            monitor-enter(r1)
            java.lang.Exception r0 = r1.next     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5
            throw r0
    }

    public synchronized boolean setNextException(java.lang.Exception r3) {
            r2 = this;
            monitor-enter(r2)
            r0 = r2
        L2:
            boolean r1 = r0 instanceof javax.mail.MessagingException     // Catch: java.lang.Throwable -> L13
            if (r1 == 0) goto L15
            r1 = r0
            javax.mail.MessagingException r1 = (javax.mail.MessagingException) r1     // Catch: java.lang.Throwable -> L13
            java.lang.Exception r1 = r1.next     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto Le
            goto L15
        Le:
            javax.mail.MessagingException r0 = (javax.mail.MessagingException) r0     // Catch: java.lang.Throwable -> L13
            java.lang.Exception r0 = r0.next     // Catch: java.lang.Throwable -> L13
            goto L2
        L13:
            r3 = move-exception
            goto L23
        L15:
            boolean r1 = r0 instanceof javax.mail.MessagingException     // Catch: java.lang.Throwable -> L13
            if (r1 == 0) goto L20
            javax.mail.MessagingException r0 = (javax.mail.MessagingException) r0     // Catch: java.lang.Throwable -> L13
            r0.next = r3     // Catch: java.lang.Throwable -> L13
            monitor-exit(r2)
            r3 = 1
            return r3
        L20:
            monitor-exit(r2)
            r3 = 0
            return r3
        L23:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L13
            throw r3
    }

    @Override // java.lang.Throwable
    public synchronized java.lang.String toString() {
            r3 = this;
            monitor-enter(r3)
            java.lang.String r0 = super.toString()     // Catch: java.lang.Throwable -> L12
            java.lang.Exception r1 = r3.next     // Catch: java.lang.Throwable -> L12
            if (r1 != 0) goto Lb
            monitor-exit(r3)
            return r0
        Lb:
            java.lang.StringBuffer r2 = new java.lang.StringBuffer     // Catch: java.lang.Throwable -> L12
            if (r0 != 0) goto L14
            java.lang.String r0 = ""
            goto L14
        L12:
            r0 = move-exception
            goto L3d
        L14:
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L12
        L17:
            if (r1 != 0) goto L1f
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L12
            monitor-exit(r3)
            return r0
        L1f:
            java.lang.String r0 = ";\n  nested exception is:\n\t"
            r2.append(r0)     // Catch: java.lang.Throwable -> L12
            boolean r0 = r1 instanceof javax.mail.MessagingException     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L34
            javax.mail.MessagingException r1 = (javax.mail.MessagingException) r1     // Catch: java.lang.Throwable -> L12
            java.lang.String r0 = r1.superToString()     // Catch: java.lang.Throwable -> L12
            r2.append(r0)     // Catch: java.lang.Throwable -> L12
            java.lang.Exception r1 = r1.next     // Catch: java.lang.Throwable -> L12
            goto L17
        L34:
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L12
            r2.append(r0)     // Catch: java.lang.Throwable -> L12
            r1 = 0
            goto L17
        L3d:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L12
            throw r0
    }
}
