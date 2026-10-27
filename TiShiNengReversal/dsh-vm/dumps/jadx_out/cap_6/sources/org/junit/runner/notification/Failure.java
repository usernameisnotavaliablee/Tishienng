package org.junit.runner.notification;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class Failure implements java.io.Serializable {
    private static final long serialVersionUID = 1;
    private final org.junit.runner.Description fDescription;
    private final java.lang.Throwable fThrownException;

    public Failure(org.junit.runner.Description r1, java.lang.Throwable r2) {
            r0 = this;
            r0.<init>()
            r0.fThrownException = r2
            r0.fDescription = r1
            return
    }

    public org.junit.runner.Description getDescription() {
            r1 = this;
            org.junit.runner.Description r0 = r1.fDescription
            return r0
    }

    public java.lang.Throwable getException() {
            r1 = this;
            java.lang.Throwable r0 = r1.fThrownException
            return r0
    }

    public java.lang.String getMessage() {
            r1 = this;
            java.lang.Throwable r0 = r1.getException()
            java.lang.String r0 = r0.getMessage()
            return r0
    }

    public java.lang.String getTestHeader() {
            r1 = this;
            org.junit.runner.Description r0 = r1.fDescription
            java.lang.String r0 = r0.getDisplayName()
            return r0
    }

    public java.lang.String getTrace() {
            r2 = this;
            java.io.StringWriter r0 = new java.io.StringWriter
            r0.<init>()
            java.io.PrintWriter r1 = new java.io.PrintWriter
            r1.<init>(r0)
            java.lang.Throwable r1 = r2.getException()
            r1.getClass()
            java.lang.String r0 = r0.toString()
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.getTestHeader()
            r0.append(r1)
            java.lang.String r1 = ": "
            r0.append(r1)
            java.lang.Throwable r1 = r2.fThrownException
            java.lang.String r1 = r1.getMessage()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
