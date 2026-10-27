package javax.activation;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class CommandInfo {
    private java.lang.String className;
    private java.lang.String verb;

    public CommandInfo(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.verb = r1
            r0.className = r2
            return
    }

    public java.lang.String getCommandClass() {
            r1 = this;
            java.lang.String r0 = r1.className
            return r0
    }

    public java.lang.String getCommandName() {
            r1 = this;
            java.lang.String r0 = r1.verb
            return r0
    }

    public java.lang.Object getCommandObject(javax.activation.DataHandler r3, java.lang.ClassLoader r4) throws java.io.IOException, java.lang.ClassNotFoundException {
            r2 = this;
            java.lang.String r0 = r2.className
            java.lang.Object r4 = java.beans.Beans.instantiate(r4, r0)
            if (r4 == 0) goto L2c
            boolean r0 = r4 instanceof javax.activation.CommandObject
            if (r0 == 0) goto L15
            r0 = r4
            javax.activation.CommandObject r0 = (javax.activation.CommandObject) r0
            java.lang.String r1 = r2.verb
            r0.setCommandContext(r1, r3)
            return r4
        L15:
            boolean r0 = r4 instanceof java.io.Externalizable
            if (r0 == 0) goto L2c
            if (r3 == 0) goto L2c
            java.io.InputStream r3 = r3.getInputStream()
            if (r3 == 0) goto L2c
            r0 = r4
            java.io.Externalizable r0 = (java.io.Externalizable) r0
            java.io.ObjectInputStream r1 = new java.io.ObjectInputStream
            r1.<init>(r3)
            r0.readExternal(r1)
        L2c:
            return r4
    }
}
