package com.lenzdz.newsApp.Repositories;

import com.lenzdz.newsApp.Entities.News;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface NewsRepository extends JpaRepository<News, Long> {

    @Query("SELECT n FROM News n WHERE n.title = :title")
    public News searchNewsByTitle(@Param("title") String title);

}
