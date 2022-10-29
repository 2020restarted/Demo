package com.example.contactstest_sy7;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;

public class MyProvider extends ContentProvider {
    public static final int CONTACTS_DIR=0;
    public static final int CONTACTS_ITEM=1;
    private static UriMatcher uriMatcher;
    static {
        uriMatcher=new UriMatcher(UriMatcher.NO_MATCH);
        uriMatcher.addURI("com.example.app.provider","contacts",CONTACTS_DIR);
        uriMatcher.addURI("com.example.app.provider","contacts/#",CONTACTS_ITEM);
    }
    public boolean onCreate(){
        return false;
    }
    public Cursor query(Uri uri,String[] projection,String selection,String[]
                        selectionArgs,String sortOrder){
        switch (uriMatcher.match(uri)){
            case CONTACTS_DIR:
                break;
            case CONTACTS_ITEM:
                break;
            default:
                break;
        }
        return null;
    }
    public Uri insert(Uri uri, ContentValues values){
        return null;
    }
    public int update(Uri uri,ContentValues values,String selection,String[]
                      selectionArgs){
        return  0;
    }
    public int delete(Uri uri,String selection,String[]selectionArgs){
        return 0;
    }
    public String getType(Uri uri){
        switch (uriMatcher.match(uri)){
            case CONTACTS_DIR:
                return "vnd.android.cursor.dir/vnd.com.example.app.provider.contacts";
            case CONTACTS_ITEM:
                return "vnd.android.cursor.item/vnd.com.example.app.provider.contacts";
        }
        return null;
    }
}

