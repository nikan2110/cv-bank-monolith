package telran.b7a.notifications.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import telran.b7a.notifications.model.NotificationRecord;

import java.time.LocalDate;
import java.util.stream.Stream;

public interface NotificationBankMongoRepository extends MongoRepository<NotificationRecord, String> {
    Stream<NotificationRecord> deleteRecordsByExpirationDateBefore(LocalDate date);
}
