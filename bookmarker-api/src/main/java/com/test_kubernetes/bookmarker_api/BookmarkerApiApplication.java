package com.test_kubernetes.bookmarker_api;

import com.test_kubernetes.bookmarker_api.domain.Bookmark;
import com.test_kubernetes.bookmarker_api.domain.BookmarkRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.Instant;

@SpringBootApplication
@RequiredArgsConstructor
public class BookmarkerApiApplication implements CommandLineRunner {

	private final BookmarkRepository bookmarkRepository;

	public static void main(String[] args) {
		SpringApplication.run(BookmarkerApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Initializing data to database");
		bookmarkRepository.save(new Bookmark(null, "SivaLabs", "https://sivalabs.in", Instant.now()));
		bookmarkRepository.save(new Bookmark(null, "SpringBlog", "https://spring.io/blog", Instant.now()));
		bookmarkRepository.save(new Bookmark(null, "Quarkus", "https://quarkus.io/", Instant.now()));
		bookmarkRepository.save(new Bookmark(null, "Micronaut", "https://micronaut.io/", Instant.now()));
		bookmarkRepository.save(new Bookmark(null, "JOOQ", "https://www.jooq.org/", Instant.now()));
		bookmarkRepository.save(new Bookmark(null, "VladMihalcea", "https://vladmihalcea.com", Instant.now()));
		bookmarkRepository.save(new Bookmark(null, "Thoughts On Java", "https://thorben-janssen.com/", Instant.now()));
		bookmarkRepository.save(new Bookmark(null, "DZone", "https://dzone.com/", Instant.now()));
		bookmarkRepository.save(new Bookmark(null, "DevOpsBookmarks", "https://www.devopsbookmarks.com/", Instant.now()));
		bookmarkRepository.save(new Bookmark(null, "Kubernetes docs", "https://kubernetes.io/docs/home/", Instant.now()));
		bookmarkRepository.save(new Bookmark(null, "Expressjs", "https://expressjs.com/", Instant.now()));
		bookmarkRepository.save(new Bookmark(null, "Marcobehler", "https://www.marcobehler.com", Instant.now()));
		bookmarkRepository.save(new Bookmark(null, "Baeldung", "https://www.baeldung.com", Instant.now()));
		bookmarkRepository.save(new Bookmark(null, "devglan", "https://www.devglan.com", Instant.now()));
		bookmarkRepository.save(new Bookmark(null, "linuxize", "https://linuxize.com", Instant.now()));
		System.out.println("Application started!");
	}
}
