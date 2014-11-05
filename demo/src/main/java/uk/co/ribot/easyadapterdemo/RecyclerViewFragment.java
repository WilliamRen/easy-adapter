/*
 * Copyright (C) 2014 Ribot Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package uk.co.ribot.easyadapterdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import uk.co.ribot.easyadapter.EasyRecyclerAdapter;

public class RecyclerViewFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View layout = inflater.inflate(R.layout.fragment_recycler_view, container, false);

        RecyclerView recyclerView = (RecyclerView) layout.findViewById(R.id.recycler_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        /*
          Simply create an EasyRecyclerAdapter by passing a Context, your ItemViewHolder class and the list of items.
          Alternatively, you can create an EasyRecyclerAdapter only with a Context and an ItemViewHolder class and set
          the list of items later.
         */
        recyclerView.setAdapter(new EasyRecyclerAdapter<Person>(getActivity(), PersonViewHolder.class, DataProvider.getMockPeopleSet2()));

        return layout;
    }

}
