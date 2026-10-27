package androidx.core.content.pm;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class ShortcutXmlParser {
    private static final java.lang.String ATTR_SHORTCUT_ID = "shortcutId";
    private static final java.lang.Object GET_INSTANCE_LOCK = null;
    private static final java.lang.String META_DATA_APP_SHORTCUTS = "android.app.shortcuts";
    private static final java.lang.String TAG = "ShortcutXmlParser";
    private static final java.lang.String TAG_SHORTCUT = "shortcut";
    private static volatile java.util.ArrayList<java.lang.String> sShortcutIds;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            androidx.core.content.pm.ShortcutXmlParser.GET_INSTANCE_LOCK = r0
            return
    }

    private ShortcutXmlParser() {
            r0 = this;
            r0.<init>()
            return
    }

    private static java.lang.String getAttributeValue(org.xmlpull.v1.XmlPullParser r1, java.lang.String r2) {
            java.lang.String r0 = "http://schemas.android.com/apk/res/android"
            java.lang.String r0 = r1.getAttributeValue(r0, r2)
            if (r0 != 0) goto Le
            r0 = 0
            java.lang.String r1 = r1.getAttributeValue(r0, r2)
            return r1
        Le:
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.WorkerThread
    public static java.util.List<java.lang.String> getShortcutIds(@androidx.annotation.NonNull android.content.Context r2) {
            java.util.ArrayList<java.lang.String> r0 = androidx.core.content.pm.ShortcutXmlParser.sShortcutIds
            if (r0 != 0) goto L22
            java.lang.Object r0 = androidx.core.content.pm.ShortcutXmlParser.GET_INSTANCE_LOCK
            monitor-enter(r0)
            java.util.ArrayList<java.lang.String> r1 = androidx.core.content.pm.ShortcutXmlParser.sShortcutIds     // Catch: java.lang.Throwable -> L1c
            if (r1 != 0) goto L1e
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L1c
            r1.<init>()     // Catch: java.lang.Throwable -> L1c
            androidx.core.content.pm.ShortcutXmlParser.sShortcutIds = r1     // Catch: java.lang.Throwable -> L1c
            java.util.ArrayList<java.lang.String> r1 = androidx.core.content.pm.ShortcutXmlParser.sShortcutIds     // Catch: java.lang.Throwable -> L1c
            java.util.Set r2 = parseShortcutIds(r2)     // Catch: java.lang.Throwable -> L1c
            r1.addAll(r2)     // Catch: java.lang.Throwable -> L1c
            goto L1e
        L1c:
            r2 = move-exception
            goto L20
        L1e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
            goto L22
        L20:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
            throw r2
        L22:
            java.util.ArrayList<java.lang.String> r2 = androidx.core.content.pm.ShortcutXmlParser.sShortcutIds
            return r2
    }

    @androidx.annotation.NonNull
    private static android.content.res.XmlResourceParser getXmlResourceParser(android.content.Context r2, android.content.pm.ActivityInfo r3) {
            android.content.pm.PackageManager r2 = r2.getPackageManager()
            java.lang.String r0 = "android.app.shortcuts"
            android.content.res.XmlResourceParser r2 = r3.loadXmlMetaData(r2, r0)
            if (r2 == 0) goto Ld
            return r2
        Ld:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Failed to open android.app.shortcuts meta-data resource of "
            r0.append(r1)
            java.lang.String r3 = r3.name
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            throw r2
    }

    @androidx.annotation.NonNull
    @androidx.annotation.VisibleForTesting
    public static java.util.List<java.lang.String> parseShortcutIds(@androidx.annotation.NonNull org.xmlpull.v1.XmlPullParser r6) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 1
            r0.<init>(r1)
        L6:
            int r2 = r6.next()
            if (r2 == r1) goto L37
            r3 = 3
            if (r2 != r3) goto L15
            int r3 = r6.getDepth()
            if (r3 <= 0) goto L37
        L15:
            int r3 = r6.getDepth()
            java.lang.String r4 = r6.getName()
            r5 = 2
            if (r2 != r5) goto L6
            if (r3 != r5) goto L6
            java.lang.String r2 = "shortcut"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L6
            java.lang.String r2 = "shortcutId"
            java.lang.String r2 = getAttributeValue(r6, r2)
            if (r2 != 0) goto L33
            goto L6
        L33:
            r0.add(r2)
            goto L6
        L37:
            return r0
    }

    @androidx.annotation.NonNull
    private static java.util.Set<java.lang.String> parseShortcutIds(@androidx.annotation.NonNull android.content.Context r5) {
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r2 = "android.intent.action.MAIN"
            r1.<init>(r2)
            java.lang.String r2 = "android.intent.category.LAUNCHER"
            r1.addCategory(r2)
            java.lang.String r2 = r5.getPackageName()
            r1.setPackage(r2)
            android.content.pm.PackageManager r2 = r5.getPackageManager()
            r3 = 128(0x80, float:1.8E-43)
            java.util.List r1 = r2.queryIntentActivities(r1, r3)
            if (r1 == 0) goto L66
            int r2 = r1.size()
            if (r2 != 0) goto L2b
            goto L66
        L2b:
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Exception -> L66
        L2f:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Exception -> L66
            if (r2 == 0) goto L66
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Exception -> L66
            android.content.pm.ResolveInfo r2 = (android.content.pm.ResolveInfo) r2     // Catch: java.lang.Exception -> L66
            android.content.pm.ActivityInfo r2 = r2.activityInfo     // Catch: java.lang.Exception -> L66
            android.os.Bundle r3 = r2.metaData     // Catch: java.lang.Exception -> L66
            if (r3 == 0) goto L2f
            java.lang.String r4 = "android.app.shortcuts"
            boolean r3 = r3.containsKey(r4)     // Catch: java.lang.Exception -> L66
            if (r3 == 0) goto L2f
            android.content.res.XmlResourceParser r2 = getXmlResourceParser(r5, r2)     // Catch: java.lang.Exception -> L66
            java.util.List r3 = parseShortcutIds(r2)     // Catch: java.lang.Throwable -> L5a
            r0.addAll(r3)     // Catch: java.lang.Throwable -> L5a
            if (r2 == 0) goto L2f
            r2.close()     // Catch: java.lang.Exception -> L66
            goto L2f
        L5a:
            r5 = move-exception
            if (r2 == 0) goto L65
            r2.close()     // Catch: java.lang.Throwable -> L61
            goto L65
        L61:
            r1 = move-exception
            r5.addSuppressed(r1)     // Catch: java.lang.Exception -> L66
        L65:
            throw r5     // Catch: java.lang.Exception -> L66
        L66:
            return r0
    }
}
