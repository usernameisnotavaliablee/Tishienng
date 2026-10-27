package androidx.core.app;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class NotificationCompatJellybean {
    static final java.lang.String EXTRA_ALLOW_GENERATED_REPLIES = "android.support.allowGeneratedReplies";
    static final java.lang.String EXTRA_DATA_ONLY_REMOTE_INPUTS = "android.support.dataRemoteInputs";
    private static final java.lang.String KEY_ACTION_INTENT = "actionIntent";
    private static final java.lang.String KEY_ALLOWED_DATA_TYPES = "allowedDataTypes";
    private static final java.lang.String KEY_ALLOW_FREE_FORM_INPUT = "allowFreeFormInput";
    private static final java.lang.String KEY_CHOICES = "choices";
    private static final java.lang.String KEY_DATA_ONLY_REMOTE_INPUTS = "dataOnlyRemoteInputs";
    private static final java.lang.String KEY_EXTRAS = "extras";
    private static final java.lang.String KEY_ICON = "icon";
    private static final java.lang.String KEY_LABEL = "label";
    private static final java.lang.String KEY_REMOTE_INPUTS = "remoteInputs";
    private static final java.lang.String KEY_RESULT_KEY = "resultKey";
    private static final java.lang.String KEY_SEMANTIC_ACTION = "semanticAction";
    private static final java.lang.String KEY_SHOWS_USER_INTERFACE = "showsUserInterface";
    private static final java.lang.String KEY_TITLE = "title";
    public static final java.lang.String TAG = "NotificationCompat";
    private static java.lang.reflect.Field sActionIconField;
    private static java.lang.reflect.Field sActionIntentField;
    private static java.lang.reflect.Field sActionTitleField;
    private static boolean sActionsAccessFailed;
    private static java.lang.reflect.Field sActionsField;
    private static final java.lang.Object sActionsLock = null;
    private static java.lang.reflect.Field sExtrasField;
    private static boolean sExtrasFieldAccessFailed;
    private static final java.lang.Object sExtrasLock = null;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            androidx.core.app.NotificationCompatJellybean.sExtrasLock = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            androidx.core.app.NotificationCompatJellybean.sActionsLock = r0
            return
    }

    private NotificationCompatJellybean() {
            r0 = this;
            r0.<init>()
            return
    }

    public static android.util.SparseArray<android.os.Bundle> buildActionExtrasMap(java.util.List<android.os.Bundle> r4) {
            int r0 = r4.size()
            r1 = 0
            r2 = 0
        L6:
            if (r2 >= r0) goto L1d
            java.lang.Object r3 = r4.get(r2)
            android.os.Bundle r3 = (android.os.Bundle) r3
            if (r3 == 0) goto L1a
            if (r1 != 0) goto L17
            android.util.SparseArray r1 = new android.util.SparseArray
            r1.<init>()
        L17:
            r1.put(r2, r3)
        L1a:
            int r2 = r2 + 1
            goto L6
        L1d:
            return r1
    }

    private static boolean ensureActionReflectionReadyLocked() {
            boolean r0 = androidx.core.app.NotificationCompatJellybean.sActionsAccessFailed
            if (r0 == 0) goto L6
            r0 = 0
            return r0
        L6:
            r0 = 1
            java.lang.reflect.Field r1 = androidx.core.app.NotificationCompatJellybean.sActionsField     // Catch: java.lang.NoSuchFieldException -> L37 java.lang.ClassNotFoundException -> L3a
            if (r1 != 0) goto L3c
            java.lang.String r1 = "android.app.Notification$Action"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.NoSuchFieldException -> L37 java.lang.ClassNotFoundException -> L3a
            java.lang.String r2 = "icon"
            java.lang.reflect.Field r2 = r1.getDeclaredField(r2)     // Catch: java.lang.NoSuchFieldException -> L37 java.lang.ClassNotFoundException -> L3a
            androidx.core.app.NotificationCompatJellybean.sActionIconField = r2     // Catch: java.lang.NoSuchFieldException -> L37 java.lang.ClassNotFoundException -> L3a
            java.lang.String r2 = "title"
            java.lang.reflect.Field r2 = r1.getDeclaredField(r2)     // Catch: java.lang.NoSuchFieldException -> L37 java.lang.ClassNotFoundException -> L3a
            androidx.core.app.NotificationCompatJellybean.sActionTitleField = r2     // Catch: java.lang.NoSuchFieldException -> L37 java.lang.ClassNotFoundException -> L3a
            java.lang.String r2 = "actionIntent"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch: java.lang.NoSuchFieldException -> L37 java.lang.ClassNotFoundException -> L3a
            androidx.core.app.NotificationCompatJellybean.sActionIntentField = r1     // Catch: java.lang.NoSuchFieldException -> L37 java.lang.ClassNotFoundException -> L3a
            java.lang.Class<android.app.Notification> r1 = android.app.Notification.class
            java.lang.String r2 = "actions"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch: java.lang.NoSuchFieldException -> L37 java.lang.ClassNotFoundException -> L3a
            androidx.core.app.NotificationCompatJellybean.sActionsField = r1     // Catch: java.lang.NoSuchFieldException -> L37 java.lang.ClassNotFoundException -> L3a
            r1.setAccessible(r0)     // Catch: java.lang.NoSuchFieldException -> L37 java.lang.ClassNotFoundException -> L3a
            goto L3c
        L37:
            androidx.core.app.NotificationCompatJellybean.sActionsAccessFailed = r0
            goto L3c
        L3a:
            androidx.core.app.NotificationCompatJellybean.sActionsAccessFailed = r0
        L3c:
            boolean r1 = androidx.core.app.NotificationCompatJellybean.sActionsAccessFailed
            r0 = r0 ^ r1
            return r0
    }

    private static androidx.core.app.RemoteInput fromBundle(android.os.Bundle r9) {
            java.lang.String r0 = "allowedDataTypes"
            java.util.ArrayList r0 = r9.getStringArrayList(r0)
            java.util.HashSet r8 = new java.util.HashSet
            r8.<init>()
            if (r0 == 0) goto L21
            java.util.Iterator r0 = r0.iterator()
        L11:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L21
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            r8.add(r1)
            goto L11
        L21:
            androidx.core.app.RemoteInput r1 = new androidx.core.app.RemoteInput
            java.lang.String r0 = "resultKey"
            java.lang.String r2 = r9.getString(r0)
            java.lang.String r0 = "label"
            java.lang.CharSequence r3 = r9.getCharSequence(r0)
            java.lang.String r0 = "choices"
            java.lang.CharSequence[] r4 = r9.getCharSequenceArray(r0)
            java.lang.String r0 = "allowFreeFormInput"
            boolean r5 = r9.getBoolean(r0)
            java.lang.String r0 = "extras"
            android.os.Bundle r7 = r9.getBundle(r0)
            r6 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return r1
    }

    private static androidx.core.app.RemoteInput[] fromBundleArray(android.os.Bundle[] r3) {
            if (r3 != 0) goto L4
            r3 = 0
            return r3
        L4:
            int r0 = r3.length
            androidx.core.app.RemoteInput[] r0 = new androidx.core.app.RemoteInput[r0]
            r1 = 0
        L8:
            int r2 = r3.length
            if (r1 >= r2) goto L16
            r2 = r3[r1]
            androidx.core.app.RemoteInput r2 = fromBundle(r2)
            r0[r1] = r2
            int r1 = r1 + 1
            goto L8
        L16:
            return r0
    }

    public static androidx.core.app.NotificationCompat.Action getAction(android.app.Notification r5, int r6) {
            java.lang.Object r0 = androidx.core.app.NotificationCompatJellybean.sActionsLock
            monitor-enter(r0)
            r1 = 0
            java.lang.Object[] r2 = getActionObjectsLocked(r5)     // Catch: java.lang.Throwable -> L21 java.lang.IllegalAccessException -> L40
            if (r2 == 0) goto L43
            r2 = r2[r6]     // Catch: java.lang.Throwable -> L21 java.lang.IllegalAccessException -> L40
            android.os.Bundle r5 = getExtras(r5)     // Catch: java.lang.Throwable -> L21 java.lang.IllegalAccessException -> L40
            if (r5 == 0) goto L23
            java.lang.String r3 = "android.support.actionExtras"
            android.util.SparseArray r5 = r5.getSparseParcelableArray(r3)     // Catch: java.lang.Throwable -> L21 java.lang.IllegalAccessException -> L40
            if (r5 == 0) goto L23
            java.lang.Object r5 = r5.get(r6)     // Catch: java.lang.Throwable -> L21 java.lang.IllegalAccessException -> L40
            android.os.Bundle r5 = (android.os.Bundle) r5     // Catch: java.lang.Throwable -> L21 java.lang.IllegalAccessException -> L40
            goto L24
        L21:
            r5 = move-exception
            goto L45
        L23:
            r5 = r1
        L24:
            java.lang.reflect.Field r6 = androidx.core.app.NotificationCompatJellybean.sActionIconField     // Catch: java.lang.Throwable -> L21 java.lang.IllegalAccessException -> L40
            int r6 = r6.getInt(r2)     // Catch: java.lang.Throwable -> L21 java.lang.IllegalAccessException -> L40
            java.lang.reflect.Field r3 = androidx.core.app.NotificationCompatJellybean.sActionTitleField     // Catch: java.lang.Throwable -> L21 java.lang.IllegalAccessException -> L40
            java.lang.Object r3 = r3.get(r2)     // Catch: java.lang.Throwable -> L21 java.lang.IllegalAccessException -> L40
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3     // Catch: java.lang.Throwable -> L21 java.lang.IllegalAccessException -> L40
            java.lang.reflect.Field r4 = androidx.core.app.NotificationCompatJellybean.sActionIntentField     // Catch: java.lang.Throwable -> L21 java.lang.IllegalAccessException -> L40
            java.lang.Object r2 = r4.get(r2)     // Catch: java.lang.Throwable -> L21 java.lang.IllegalAccessException -> L40
            android.app.PendingIntent r2 = (android.app.PendingIntent) r2     // Catch: java.lang.Throwable -> L21 java.lang.IllegalAccessException -> L40
            androidx.core.app.NotificationCompat$Action r5 = readAction(r6, r3, r2, r5)     // Catch: java.lang.Throwable -> L21 java.lang.IllegalAccessException -> L40
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            return r5
        L40:
            r5 = 1
            androidx.core.app.NotificationCompatJellybean.sActionsAccessFailed = r5     // Catch: java.lang.Throwable -> L21
        L43:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            return r1
        L45:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            throw r5
    }

    public static int getActionCount(android.app.Notification r1) {
            java.lang.Object r0 = androidx.core.app.NotificationCompatJellybean.sActionsLock
            monitor-enter(r0)
            java.lang.Object[] r1 = getActionObjectsLocked(r1)     // Catch: java.lang.Throwable -> Lb
            if (r1 == 0) goto Ld
            int r1 = r1.length     // Catch: java.lang.Throwable -> Lb
            goto Le
        Lb:
            r1 = move-exception
            goto L10
        Ld:
            r1 = 0
        Le:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            return r1
        L10:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r1
    }

    static androidx.core.app.NotificationCompat.Action getActionFromBundle(android.os.Bundle r15) {
            java.lang.String r0 = "extras"
            android.os.Bundle r1 = r15.getBundle(r0)
            r2 = 0
            if (r1 == 0) goto L11
            java.lang.String r3 = "android.support.allowGeneratedReplies"
            boolean r2 = r1.getBoolean(r3, r2)
            r10 = r2
            goto L12
        L11:
            r10 = 0
        L12:
            androidx.core.app.NotificationCompat$Action r3 = new androidx.core.app.NotificationCompat$Action
            java.lang.String r1 = "icon"
            int r4 = r15.getInt(r1)
            java.lang.String r1 = "title"
            java.lang.CharSequence r5 = r15.getCharSequence(r1)
            java.lang.String r1 = "actionIntent"
            android.os.Parcelable r1 = r15.getParcelable(r1)
            r6 = r1
            android.app.PendingIntent r6 = (android.app.PendingIntent) r6
            android.os.Bundle r7 = r15.getBundle(r0)
            java.lang.String r0 = "remoteInputs"
            android.os.Bundle[] r0 = getBundleArrayFromBundle(r15, r0)
            androidx.core.app.RemoteInput[] r8 = fromBundleArray(r0)
            java.lang.String r0 = "dataOnlyRemoteInputs"
            android.os.Bundle[] r0 = getBundleArrayFromBundle(r15, r0)
            androidx.core.app.RemoteInput[] r9 = fromBundleArray(r0)
            java.lang.String r0 = "semanticAction"
            int r11 = r15.getInt(r0)
            java.lang.String r0 = "showsUserInterface"
            boolean r12 = r15.getBoolean(r0)
            r13 = 0
            r14 = 0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return r3
    }

    private static java.lang.Object[] getActionObjectsLocked(android.app.Notification r3) {
            java.lang.Object r0 = androidx.core.app.NotificationCompatJellybean.sActionsLock
            monitor-enter(r0)
            boolean r1 = ensureActionReflectionReadyLocked()     // Catch: java.lang.Throwable -> Lc
            r2 = 0
            if (r1 != 0) goto Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            return r2
        Lc:
            r3 = move-exception
            goto L1d
        Le:
            java.lang.reflect.Field r1 = androidx.core.app.NotificationCompatJellybean.sActionsField     // Catch: java.lang.Throwable -> Lc java.lang.IllegalAccessException -> L18
            java.lang.Object r3 = r1.get(r3)     // Catch: java.lang.Throwable -> Lc java.lang.IllegalAccessException -> L18
            java.lang.Object[] r3 = (java.lang.Object[]) r3     // Catch: java.lang.Throwable -> Lc java.lang.IllegalAccessException -> L18
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            return r3
        L18:
            r3 = 1
            androidx.core.app.NotificationCompatJellybean.sActionsAccessFailed = r3     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            return r2
        L1d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            throw r3
    }

    private static android.os.Bundle[] getBundleArrayFromBundle(android.os.Bundle r3, java.lang.String r4) {
            android.os.Parcelable[] r0 = r3.getParcelableArray(r4)
            boolean r1 = r0 instanceof android.os.Bundle[]
            if (r1 != 0) goto L18
            if (r0 != 0) goto Lb
            goto L18
        Lb:
            int r1 = r0.length
            java.lang.Class<android.os.Bundle[]> r2 = android.os.Bundle[].class
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1, r2)
            android.os.Bundle[] r0 = (android.os.Bundle[]) r0
            r3.putParcelableArray(r4, r0)
            return r0
        L18:
            android.os.Bundle[] r0 = (android.os.Bundle[]) r0
            return r0
    }

    static android.os.Bundle getBundleForAction(androidx.core.app.NotificationCompat.Action r4) {
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            androidx.core.graphics.drawable.IconCompat r1 = r4.getIconCompat()
            if (r1 == 0) goto L10
            int r1 = r1.getResId()
            goto L11
        L10:
            r1 = 0
        L11:
            java.lang.String r2 = "icon"
            r0.putInt(r2, r1)
            java.lang.String r1 = "title"
            java.lang.CharSequence r2 = r4.getTitle()
            r0.putCharSequence(r1, r2)
            java.lang.String r1 = "actionIntent"
            android.app.PendingIntent r2 = r4.getActionIntent()
            r0.putParcelable(r1, r2)
            android.os.Bundle r1 = r4.getExtras()
            if (r1 == 0) goto L38
            android.os.Bundle r1 = new android.os.Bundle
            android.os.Bundle r2 = r4.getExtras()
            r1.<init>(r2)
            goto L3d
        L38:
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
        L3d:
            java.lang.String r2 = "android.support.allowGeneratedReplies"
            boolean r3 = r4.getAllowGeneratedReplies()
            r1.putBoolean(r2, r3)
            java.lang.String r2 = "extras"
            r0.putBundle(r2, r1)
            androidx.core.app.RemoteInput[] r1 = r4.getRemoteInputs()
            android.os.Bundle[] r1 = toBundleArray(r1)
            java.lang.String r2 = "remoteInputs"
            r0.putParcelableArray(r2, r1)
            java.lang.String r1 = "showsUserInterface"
            boolean r2 = r4.getShowsUserInterface()
            r0.putBoolean(r1, r2)
            java.lang.String r1 = "semanticAction"
            int r4 = r4.getSemanticAction()
            r0.putInt(r1, r4)
            return r0
    }

    public static android.os.Bundle getExtras(android.app.Notification r6) {
            java.lang.Object r0 = androidx.core.app.NotificationCompatJellybean.sExtrasLock
            monitor-enter(r0)
            boolean r1 = androidx.core.app.NotificationCompatJellybean.sExtrasFieldAccessFailed     // Catch: java.lang.Throwable -> La
            r2 = 0
            if (r1 == 0) goto Lc
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return r2
        La:
            r6 = move-exception
            goto L48
        Lc:
            r1 = 1
            java.lang.reflect.Field r3 = androidx.core.app.NotificationCompatJellybean.sExtrasField     // Catch: java.lang.Throwable -> La java.lang.Throwable -> L44
            if (r3 != 0) goto L2e
            java.lang.Class<android.app.Notification> r3 = android.app.Notification.class
            java.lang.String r4 = "extras"
            java.lang.reflect.Field r3 = r3.getDeclaredField(r4)     // Catch: java.lang.Throwable -> La java.lang.Throwable -> L44
            java.lang.Class<android.os.Bundle> r4 = android.os.Bundle.class
            java.lang.Class r5 = r3.getType()     // Catch: java.lang.Throwable -> La java.lang.Throwable -> L44
            boolean r4 = r4.isAssignableFrom(r5)     // Catch: java.lang.Throwable -> La java.lang.Throwable -> L44
            if (r4 != 0) goto L29
            androidx.core.app.NotificationCompatJellybean.sExtrasFieldAccessFailed = r1     // Catch: java.lang.Throwable -> La java.lang.Throwable -> L44
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return r2
        L29:
            r3.setAccessible(r1)     // Catch: java.lang.Throwable -> La java.lang.Throwable -> L44 java.lang.Throwable -> L44
            androidx.core.app.NotificationCompatJellybean.sExtrasField = r3     // Catch: java.lang.Throwable -> La java.lang.Throwable -> L44 java.lang.Throwable -> L44
        L2e:
            java.lang.reflect.Field r3 = androidx.core.app.NotificationCompatJellybean.sExtrasField     // Catch: java.lang.Throwable -> La java.lang.Throwable -> L44 java.lang.Throwable -> L44
            java.lang.Object r3 = r3.get(r6)     // Catch: java.lang.Throwable -> La java.lang.Throwable -> L44 java.lang.Throwable -> L44
            android.os.Bundle r3 = (android.os.Bundle) r3     // Catch: java.lang.Throwable -> La java.lang.Throwable -> L44 java.lang.Throwable -> L44
            if (r3 != 0) goto L42
            android.os.Bundle r3 = new android.os.Bundle     // Catch: java.lang.Throwable -> La java.lang.Throwable -> L44 java.lang.Throwable -> L44
            r3.<init>()     // Catch: java.lang.Throwable -> La java.lang.Throwable -> L44 java.lang.Throwable -> L44
            java.lang.reflect.Field r4 = androidx.core.app.NotificationCompatJellybean.sExtrasField     // Catch: java.lang.Throwable -> La java.lang.Throwable -> L44 java.lang.Throwable -> L44
            r4.set(r6, r3)     // Catch: java.lang.Throwable -> La java.lang.Throwable -> L44 java.lang.Throwable -> L44
        L42:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return r3
        L44:
            androidx.core.app.NotificationCompatJellybean.sExtrasFieldAccessFailed = r1     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return r2
        L48:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r6
    }

    public static androidx.core.app.NotificationCompat.Action readAction(int r12, java.lang.CharSequence r13, android.app.PendingIntent r14, android.os.Bundle r15) {
            if (r15 == 0) goto L20
            java.lang.String r0 = "android.support.remoteInputs"
            android.os.Bundle[] r0 = getBundleArrayFromBundle(r15, r0)
            androidx.core.app.RemoteInput[] r0 = fromBundleArray(r0)
            java.lang.String r1 = "android.support.dataRemoteInputs"
            android.os.Bundle[] r1 = getBundleArrayFromBundle(r15, r1)
            androidx.core.app.RemoteInput[] r1 = fromBundleArray(r1)
            java.lang.String r2 = "android.support.allowGeneratedReplies"
            boolean r2 = r15.getBoolean(r2)
            r5 = r0
            r6 = r1
            r7 = r2
            goto L25
        L20:
            r0 = 0
            r2 = 0
            r5 = r0
            r6 = r5
            r7 = 0
        L25:
            androidx.core.app.NotificationCompat$Action r0 = new androidx.core.app.NotificationCompat$Action
            r10 = 0
            r11 = 0
            r8 = 0
            r9 = 1
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r0
    }

    private static android.os.Bundle toBundle(androidx.core.app.RemoteInput r3) {
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "resultKey"
            java.lang.String r2 = r3.getResultKey()
            r0.putString(r1, r2)
            java.lang.String r1 = "label"
            java.lang.CharSequence r2 = r3.getLabel()
            r0.putCharSequence(r1, r2)
            java.lang.String r1 = "choices"
            java.lang.CharSequence[] r2 = r3.getChoices()
            r0.putCharSequenceArray(r1, r2)
            java.lang.String r1 = "allowFreeFormInput"
            boolean r2 = r3.getAllowFreeFormInput()
            r0.putBoolean(r1, r2)
            java.lang.String r1 = "extras"
            android.os.Bundle r2 = r3.getExtras()
            r0.putBundle(r1, r2)
            java.util.Set r3 = r3.getAllowedDataTypes()
            if (r3 == 0) goto L60
            boolean r1 = r3.isEmpty()
            if (r1 != 0) goto L60
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r3.size()
            r1.<init>(r2)
            java.util.Iterator r3 = r3.iterator()
        L4b:
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto L5b
            java.lang.Object r2 = r3.next()
            java.lang.String r2 = (java.lang.String) r2
            r1.add(r2)
            goto L4b
        L5b:
            java.lang.String r3 = "allowedDataTypes"
            r0.putStringArrayList(r3, r1)
        L60:
            return r0
    }

    private static android.os.Bundle[] toBundleArray(androidx.core.app.RemoteInput[] r3) {
            if (r3 != 0) goto L4
            r3 = 0
            return r3
        L4:
            int r0 = r3.length
            android.os.Bundle[] r0 = new android.os.Bundle[r0]
            r1 = 0
        L8:
            int r2 = r3.length
            if (r1 >= r2) goto L16
            r2 = r3[r1]
            android.os.Bundle r2 = toBundle(r2)
            r0[r1] = r2
            int r1 = r1 + 1
            goto L8
        L16:
            return r0
    }

    public static android.os.Bundle writeActionAndGetExtras(android.app.Notification.Builder r3, androidx.core.app.NotificationCompat.Action r4) {
            androidx.core.graphics.drawable.IconCompat r0 = r4.getIconCompat()
            if (r0 == 0) goto Lb
            int r0 = r0.getResId()
            goto Lc
        Lb:
            r0 = 0
        Lc:
            java.lang.CharSequence r1 = r4.getTitle()
            android.app.PendingIntent r2 = r4.getActionIntent()
            r3.addAction(r0, r1, r2)
            android.os.Bundle r3 = new android.os.Bundle
            android.os.Bundle r0 = r4.getExtras()
            r3.<init>(r0)
            androidx.core.app.RemoteInput[] r0 = r4.getRemoteInputs()
            if (r0 == 0) goto L33
            androidx.core.app.RemoteInput[] r0 = r4.getRemoteInputs()
            android.os.Bundle[] r0 = toBundleArray(r0)
            java.lang.String r1 = "android.support.remoteInputs"
            r3.putParcelableArray(r1, r0)
        L33:
            androidx.core.app.RemoteInput[] r0 = r4.getDataOnlyRemoteInputs()
            if (r0 == 0) goto L46
            androidx.core.app.RemoteInput[] r0 = r4.getDataOnlyRemoteInputs()
            android.os.Bundle[] r0 = toBundleArray(r0)
            java.lang.String r1 = "android.support.dataRemoteInputs"
            r3.putParcelableArray(r1, r0)
        L46:
            java.lang.String r0 = "android.support.allowGeneratedReplies"
            boolean r4 = r4.getAllowGeneratedReplies()
            r3.putBoolean(r0, r4)
            return r3
    }
}
