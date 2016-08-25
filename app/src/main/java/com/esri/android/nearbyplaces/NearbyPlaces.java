/* Copyright 2016 Esri
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * For additional information, contact:
 * Environmental Systems Research Institute, Inc.
 * Attn: Contracts Dept
 * 380 New York Street
 * Redlands, California, USA 92373
 *
 * email: contracts@esri.com
 *
 */

package com.esri.android.nearbyplaces;

import android.app.Application;
import android.content.Context;

/**
 * Created by sand8529 on 7/7/16.
 */
public class NearbyPlaces extends Application {

  private static Context mContext;
  public static final String LATITUDE= "latitude";
  public static final String LONGITUDE = "longitude";

  @Override
  public void onCreate(){
    super.onCreate();
    mContext = this;
  }

  public static Context getContext(){
    return mContext;
  }
}