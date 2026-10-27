package io.netty.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class Version {
    private static final java.lang.String PROP_BUILD_DATE = ".buildDate";
    private static final java.lang.String PROP_COMMIT_DATE = ".commitDate";
    private static final java.lang.String PROP_LONG_COMMIT_HASH = ".longCommitHash";
    private static final java.lang.String PROP_REPO_STATUS = ".repoStatus";
    private static final java.lang.String PROP_SHORT_COMMIT_HASH = ".shortCommitHash";
    private static final java.lang.String PROP_VERSION = ".version";
    private final java.lang.String artifactId;
    private final java.lang.String artifactVersion;
    private final long buildTimeMillis;
    private final long commitTimeMillis;
    private final java.lang.String longCommitHash;
    private final java.lang.String repositoryStatus;
    private final java.lang.String shortCommitHash;

    private Version(java.lang.String r1, java.lang.String r2, long r3, long r5, java.lang.String r7, java.lang.String r8, java.lang.String r9) {
            r0 = this;
            r0.<init>()
            r0.artifactId = r1
            r0.artifactVersion = r2
            r0.buildTimeMillis = r3
            r0.commitTimeMillis = r5
            r0.shortCommitHash = r7
            r0.longCommitHash = r8
            r0.repositoryStatus = r9
            return
    }

    public static java.util.Map<java.lang.String, io.netty.util.Version> identify() {
            r0 = 0
            java.util.Map r0 = identify(r0)
            return r0
    }

    public static java.util.Map<java.lang.String, io.netty.util.Version> identify(java.lang.ClassLoader r20) {
            if (r20 != 0) goto L7
            java.lang.ClassLoader r0 = io.netty.util.internal.PlatformDependent.getContextClassLoader()
            goto L9
        L7:
            r0 = r20
        L9:
            java.util.Properties r1 = new java.util.Properties
            r1.<init>()
            java.lang.String r2 = "META-INF/io.netty.versions.properties"
            java.util.Enumeration r0 = r0.getResources(r2)     // Catch: java.lang.Exception -> L30
        L14:
            boolean r2 = r0.hasMoreElements()     // Catch: java.lang.Exception -> L30
            if (r2 == 0) goto L30
            java.lang.Object r2 = r0.nextElement()     // Catch: java.lang.Exception -> L30
            java.net.URL r2 = (java.net.URL) r2     // Catch: java.lang.Exception -> L30
            java.io.InputStream r2 = r2.openStream()     // Catch: java.lang.Exception -> L30
            r1.load(r2)     // Catch: java.lang.Throwable -> L2b
            r2.close()     // Catch: java.lang.Exception -> L14
            goto L14
        L2b:
            r0 = move-exception
            r2.close()     // Catch: java.lang.Exception -> L2f
        L2f:
            throw r0     // Catch: java.lang.Exception -> L30
        L30:
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.Set r2 = r1.keySet()
            java.util.Iterator r2 = r2.iterator()
        L3d:
            boolean r3 = r2.hasNext()
            java.lang.String r4 = ".repoStatus"
            java.lang.String r5 = ".longCommitHash"
            java.lang.String r6 = ".shortCommitHash"
            java.lang.String r7 = ".commitDate"
            java.lang.String r8 = ".buildDate"
            java.lang.String r9 = ".version"
            if (r3 == 0) goto Le8
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            r10 = 46
            int r10 = r3.indexOf(r10)
            if (r10 > 0) goto L5e
            goto L3d
        L5e:
            r11 = 0
            java.lang.String r3 = r3.substring(r11, r10)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r3)
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            boolean r9 = r1.containsKey(r9)
            if (r9 == 0) goto L3d
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r3)
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            boolean r8 = r1.containsKey(r8)
            if (r8 == 0) goto L3d
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r3)
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            boolean r7 = r1.containsKey(r7)
            if (r7 == 0) goto L3d
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r3)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            boolean r6 = r1.containsKey(r6)
            if (r6 == 0) goto L3d
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r3)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            boolean r5 = r1.containsKey(r5)
            if (r5 == 0) goto L3d
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            boolean r4 = r1.containsKey(r4)
            if (r4 != 0) goto Le3
            goto L3d
        Le3:
            r0.add(r3)
            goto L3d
        Le8:
            java.util.TreeMap r2 = new java.util.TreeMap
            r2.<init>()
            java.util.Iterator r0 = r0.iterator()
        Lf1:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L182
            java.lang.Object r3 = r0.next()
            r11 = r3
            java.lang.String r11 = (java.lang.String) r11
            io.netty.util.Version r10 = new io.netty.util.Version
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r11)
            r3.append(r9)
            java.lang.String r3 = r3.toString()
            java.lang.String r12 = r1.getProperty(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r11)
            r3.append(r8)
            java.lang.String r3 = r3.toString()
            java.lang.String r3 = r1.getProperty(r3)
            long r13 = parseIso8601(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r11)
            r3.append(r7)
            java.lang.String r3 = r3.toString()
            java.lang.String r3 = r1.getProperty(r3)
            long r15 = parseIso8601(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r11)
            r3.append(r6)
            java.lang.String r3 = r3.toString()
            java.lang.String r17 = r1.getProperty(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r11)
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            java.lang.String r18 = r1.getProperty(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r11)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r19 = r1.getProperty(r3)
            r10.<init>(r11, r12, r13, r15, r17, r18, r19)
            r2.put(r11, r10)
            goto Lf1
        L182:
            return r2
    }

    public static void main(java.lang.String[] r1) {
            java.util.Map r1 = identify()
            java.util.Collection r1 = r1.values()
            java.util.Iterator r1 = r1.iterator()
        Lc:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L1e
            java.lang.Object r0 = r1.next()
            io.netty.util.Version r0 = (io.netty.util.Version) r0
            java.io.PrintStream r0 = java.lang.System.err
            r0.getClass()
            goto Lc
        L1e:
            return
    }

    private static long parseIso8601(java.lang.String r2) {
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat     // Catch: java.text.ParseException -> L10
            java.lang.String r1 = "yyyy-MM-dd HH:mm:ss Z"
            r0.<init>(r1)     // Catch: java.text.ParseException -> L10
            java.util.Date r2 = r0.parse(r2)     // Catch: java.text.ParseException -> L10
            long r0 = r2.getTime()     // Catch: java.text.ParseException -> L10
            return r0
        L10:
            r0 = 0
            return r0
    }

    public java.lang.String artifactId() {
            r1 = this;
            java.lang.String r0 = r1.artifactId
            return r0
    }

    public java.lang.String artifactVersion() {
            r1 = this;
            java.lang.String r0 = r1.artifactVersion
            return r0
    }

    public long buildTimeMillis() {
            r2 = this;
            long r0 = r2.buildTimeMillis
            return r0
    }

    public long commitTimeMillis() {
            r2 = this;
            long r0 = r2.commitTimeMillis
            return r0
    }

    public java.lang.String longCommitHash() {
            r1 = this;
            java.lang.String r0 = r1.longCommitHash
            return r0
    }

    public java.lang.String repositoryStatus() {
            r1 = this;
            java.lang.String r0 = r1.repositoryStatus
            return r0
    }

    public java.lang.String shortCommitHash() {
            r1 = this;
            java.lang.String r0 = r1.shortCommitHash
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r3.artifactId
            r0.append(r1)
            r1 = 45
            r0.append(r1)
            java.lang.String r1 = r3.artifactVersion
            r0.append(r1)
            r1 = 46
            r0.append(r1)
            java.lang.String r1 = r3.shortCommitHash
            r0.append(r1)
            java.lang.String r1 = "clean"
            java.lang.String r2 = r3.repositoryStatus
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L2b
            java.lang.String r1 = ""
            goto L43
        L2b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = " (repository: "
            r1.append(r2)
            java.lang.String r2 = r3.repositoryStatus
            r1.append(r2)
            r2 = 41
            r1.append(r2)
            java.lang.String r1 = r1.toString()
        L43:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
